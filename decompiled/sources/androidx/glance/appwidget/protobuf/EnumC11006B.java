package androidx.glance.appwidget.protobuf;

import java.io.Serializable;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.B */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC11006B {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(C11042g.class, C11042g.f33300o0),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);


    /* JADX INFO: renamed from: Y */
    public final Serializable f33235Y;

    EnumC11006B(Class cls, Serializable serializable) {
        this.f33235Y = serializable;
    }
}
