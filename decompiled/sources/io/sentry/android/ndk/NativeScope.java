package io.sentry.android.ndk;

/* JADX INFO: loaded from: classes3.dex */
final class NativeScope implements InterfaceC15263a {
    public static native void nativeAddBreadcrumb(String str, String str2, String str3, String str4, String str5, String str6);

    public static native void nativeRemoveUser();

    public static native void nativeSetTag(String str, String str2);

    public static native void nativeSetUser(String str, String str2, String str3, String str4);
}
