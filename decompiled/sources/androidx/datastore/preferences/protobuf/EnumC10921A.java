package androidx.datastore.preferences.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.A */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC10921A {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C10957f.class, C10957f.f33028o0),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: Y */
    public final Serializable f32953Y;

    EnumC10921A(Class cls, Serializable serializable) {
        this.f32953Y = serializable;
    }
}
