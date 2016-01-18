package com.cloudsimbaautotest.main1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class main1
 */
@WebServlet("/main1")
public class main1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public main1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "http://cloudsimba.com/portal/monitor.php";
		
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();

		// optional default is GET
		con.setRequestMethod("GET");

		//add request header


		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response1 = new StringBuffer();

		while ((inputLine = in.readLine()) != null) {
			response1.append(inputLine);
		}
		in.close();
		String ideal ="123";
  
		//print result
		String a =response1.toString();
		System.out.println(a);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//if(a.equals(ideal))System.out.println("functioning fine");
          //      else
		{
		
			String url2 = "http://localhost:8080/myproject4/main2";
			
			URL obj2 = new URL(url2);
			HttpURLConnection con2 = (HttpURLConnection) obj.openConnection();

			 
			con2.setRequestMethod("GET");
			System.out.println("Response Code : " + responseCode);
			BufferedReader in2 = new BufferedReader(
			        new InputStreamReader(con2.getInputStream()));
			String inputLine2;
			StringBuffer response2 = new StringBuffer();

			while ((inputLine2 = in2.readLine()) != null) {
				response2.append(inputLine2);
			}
			in2.close();
		}
		System.out.println("finish");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
