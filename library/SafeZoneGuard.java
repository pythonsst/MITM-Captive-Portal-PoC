package library;

import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

public class SafeZoneGuard {
    public static OkHttpClient getSecureClient() {
        // This is the "Secret Handshake" that blocks your own attack!
        CertificatePinner pinner = new CertificatePinner.Builder()
            .add("validusfintech.com", "sha256/7HIp6Efd0V3F8SStWbk46uX6V10fsh6z8SDA9O6B36c=")
            .build();

        return new OkHttpClient.Builder()
            .certificatePinner(pinner)
            .build();
    }
}