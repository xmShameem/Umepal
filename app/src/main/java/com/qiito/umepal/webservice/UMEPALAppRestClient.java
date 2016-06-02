package com.qiito.umepal.webservice;

import android.content.Context;
import android.util.Log;

import com.qiito.umepal.Utilvalidate.UtilValidate;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.auth.AuthScope;

import java.util.Map;
import java.util.Map.Entry;

public class UMEPALAppRestClient {

	private static final String Tag = UMEPALAppRestClient.class.getName();

	private static AsyncHttpClient client = new AsyncHttpClient();

	/**
	 * @param url
	 * @param params
	 * @param headers
	 * @param responseHandler
	 */
	public static void get(String url, RequestParams params,
			Map<String, String> headers,
			AsyncHttpResponseHandler responseHandler) {

		if (UtilValidate.isNotEmpty(headers)) {
			for (Entry<String, String> header : headers.entrySet()) {
				client.addHeader(header.getKey(), header.getValue());
			}
		}
		Log.e(Tag, ">>>>>>>>>>>>>>>>>>"+url+params);
		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM));
		client.get(url, params, responseHandler);
	}

	/**
	 * @param url
	 * @param params
	 * @param ctx
	 * @param headers
	 * @param responseHandler
	 */
	public static void post(String url, RequestParams params, Context ctx,
			Map<String, String> headers,
			AsyncHttpResponseHandler responseHandler) {

		if (UtilValidate.isNotEmpty(headers)) {
			for (Entry<String, String> header : headers.entrySet()) {
				client.addHeader(header.getKey(), header.getValue());
			}
		}
Log.e(Tag, "url"+url+"?"+params+"header"+headers);
		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM));

		Log.i(Tag, "Request url : " + url);
		client.post(ctx, url, params, responseHandler);

	}

	/**
	 * @param url
	 * @param multipartEntity
	 * @param mime
	 * @param ctx
	 * @param headers
	 * @param responseHandler
	 */
	public static void post(String url, HttpEntity multipartEntity,
			String mime, Context ctx, Map<String, String> headers,
			AsyncHttpResponseHandler responseHandler) {

		if (UtilValidate.isNotEmpty(headers)) {
			for (Entry<String, String> header : headers.entrySet()) {
				client.addHeader(header.getKey(), header.getValue());
			}
		}

		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, 19680, AuthScope.ANY_REALM));

		Log.i(Tag, "Request url : " + url);
		client.post(ctx, url, multipartEntity, mime, responseHandler);

	}

	/**
	 * @param url
	 * @param params
	 * @param ctx
	 * @param responseHandler
	 */
	public static void post(String url, RequestParams params, Context ctx,
			AsyncHttpResponseHandler responseHandler) {

		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM));
		client.post(ctx, url, params, responseHandler);
		Log.e("","in app rest client");
		Log.e("","params>>>>"+params);
		Log.e(Tag, "Request url : " + url+params);
	}

	/**
	 * @param url
	 * @param params
	 * @param ctx
	 * @param responseHandler
	 */
	public static void put(String url, RequestParams params, Context ctx,
			AsyncHttpResponseHandler responseHandler) {

		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM));

		client.put(ctx, url, params, responseHandler);

	}

	/**
	 * @param ctx
	 * @param url
	 * @param headers
	 * @param responseHandler
	 */
	public static void delete(Context ctx, String url, Header[] headers,
			AsyncHttpResponseHandler responseHandler) {

		client.setBasicAuth("worldcup", "coconut", new AuthScope(
				AuthScope.ANY_HOST, AuthScope.ANY_PORT, AuthScope.ANY_REALM));

		client.delete(ctx, url, headers, responseHandler);

	}

}
