import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author casva
 */
public class Test {

    static List<CarTracker> cars = new ArrayList<>();
    //localhost:8080/VerplaatsingSysteem/Rest/ftocservice/iuyU1kNv634s29ss6HgrVUvfy2H6Rvtp1yFzCQXwSBQ=
    public static void main(String[] args) throws InterruptedException, Exception {
        String url = "http://localhost:8080/VerplaatsingSysteem/Rest/ftocservice/Fy9GvFbfAiUjpcRePeZOyPGHLNCDjwQIXEFY7AUjywQ=";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");
		

		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);

		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		in.close();
                JSONArray array = new JSONArray(response.toString());
                JSONArray array2 = array.getJSONArray(0);
                for(int i = 0; i < array2.length(); i++){
                    JSONObject object = array2.getJSONObject(i);
                    CarTracker car = new CarTracker(object.getInt("id"),object.getInt("carId"),object.getDouble("lat"),object.getDouble("long"));
                    cars.add(car);
                }
		
		System.out.println(response.toString());
    }
}
