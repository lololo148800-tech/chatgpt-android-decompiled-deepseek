package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.X */
/* JADX INFO: loaded from: classes3.dex */
public final class C12129X extends AbstractC12078C {

    /* JADX INFO: renamed from: a */
    public final InterfaceC12091G0 f36990a;

    /* JADX INFO: renamed from: b */
    public final Object f36991b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC12091G0 f36992c;

    /* JADX INFO: renamed from: d */
    public final C12127W f36993d;

    public C12129X(InterfaceC12091G0 interfaceC12091G0, Object obj, InterfaceC12091G0 interfaceC12091G1, C12127W c12127w) {
        if (interfaceC12091G0 == null) {
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }
        if (c12127w.f36984Z == EnumC12101J1.f36918r0 && interfaceC12091G1 == null) {
            throw new IllegalArgumentException("Null messageDefaultInstance");
        }
        this.f36990a = interfaceC12091G0;
        this.f36991b = obj;
        this.f36992c = interfaceC12091G1;
        this.f36993d = c12127w;
    }

    /* JADX INFO: renamed from: a */
    public final Object m13870a(Object obj) {
        if (this.f36993d.f36984Z.f36922Y != EnumC12104K1.ENUM) {
            return obj;
        }
        ((Integer) obj).intValue();
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final Object m13871b(Object obj) {
        return this.f36993d.f36984Z.f36922Y == EnumC12104K1.ENUM ? Integer.valueOf(((InterfaceC12151f0) obj).getNumber()) : obj;
    }
}
