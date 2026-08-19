package livekit.org.webrtc;

/* JADX INFO: loaded from: classes2.dex */
class NativeLibrary {
    private static String TAG = "NativeLibrary";
    private static boolean libraryLoaded;
    private static Object lock = new Object();

    public static class DefaultLoader implements NativeLibraryLoader {
        @Override // livekit.org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            Logging.m18742d(NativeLibrary.TAG, "Loading library: " + str);
            System.loadLibrary(str);
            return true;
        }
    }

    public static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    Logging.m18742d(TAG, "Native library has already been loaded.");
                    return;
                }
                Logging.m18742d(TAG, "Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean isLoaded() {
        boolean z6;
        synchronized (lock) {
            z6 = libraryLoaded;
        }
        return z6;
    }
}
