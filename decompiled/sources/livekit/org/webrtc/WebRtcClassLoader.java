package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
class WebRtcClassLoader {
    public static Object getClassLoader() {
        ClassLoader classLoader = WebRtcClassLoader.class.getClassLoader();
        if (classLoader != null) {
            return classLoader;
        }
        throw new RuntimeException("Failed to get WebRTC class loader.");
    }
}
