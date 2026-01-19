package com.safezone.guard;

import okhttp3.CertificatePinner;
import okhttp3.OkHttpClient;

/**
 * SafeZoneGuard: The hero that stops Man-in-the-Middle attacks 
 * even if the user installs a malicious CA certificate.
 */
public class SafeZoneGuard {
    public static OkHttpClient getSecureClient() {
        // Replace with your actual SHA-256 hash from Step 1
        CertificatePinner pinner = new CertificatePinner.Builder()
            .add("api.yourdomain.com", "sha256/7HIp6Efd0V3F8SStWbk46uX6V10fsh6z8SDA9O6B36c=")
            .build();

        return new OkHttpClient.Builder()
            .certificatePinner(pinner)
            .build();
    }
}
