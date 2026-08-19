package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.D0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12082D0 {

    /* JADX INFO: renamed from: a */
    public static final C12079C0 f36872a;

    /* JADX INFO: renamed from: b */
    public static final C12079C0 f36873b;

    static {
        C12079C0 c12079c0 = null;
        try {
            c12079c0 = (C12079C0) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f36872a = c12079c0;
        f36873b = new C12079C0();
    }
}
