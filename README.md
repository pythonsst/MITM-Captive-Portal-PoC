# SafeZone-Guard 🚉

An open-source research project demonstrating how to secure mobile applications against **Captive Portal Man-in-the-Middle (MITM)** attacks.

### 🔍 The Research

When connecting to public Wi-Fi (e.g., Railway stations), attackers use ARP Spoofing and DNS Hijacking to redirect users to fake portals.

### 🛡️ The Solution

This project provides a Java/Android implementation of **SSL Pinning**. By hardcoding the server's SHA-256 Public Key fingerprint, the app rejects any connection intercepted by tools like Charles Proxy or Bettercap.
