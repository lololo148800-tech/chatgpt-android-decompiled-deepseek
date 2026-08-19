package p165G9;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: G9.h */
/* JADX INFO: loaded from: classes.dex */
public final class C3022h extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z6) {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z6);
    }
}
