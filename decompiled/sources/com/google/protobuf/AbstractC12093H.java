package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.H */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12093H {

    /* JADX INFO: renamed from: a */
    public static final C12090G f36887a = new C12090G();

    /* JADX INFO: renamed from: b */
    public static final C12090G f36888b;

    static {
        C12090G c12090g = null;
        try {
            c12090g = (C12090G) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f36888b = c12090g;
    }
}
