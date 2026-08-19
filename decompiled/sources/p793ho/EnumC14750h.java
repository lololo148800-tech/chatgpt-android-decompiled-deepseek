package p793ho;

import com.google.protobuf.InterfaceC12151f0;

/* JADX INFO: renamed from: ho.h */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC14750h implements InterfaceC12151f0 {
    JS_PENDING(0),
    JS_RUNNING(1),
    JS_SUCCESS(2),
    JS_FAILED(3),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: Y */
    public final int f46139Y;

    EnumC14750h(int i10) {
        this.f46139Y = i10;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC14750h m16049a(int i10) {
        if (i10 == 0) {
            return JS_PENDING;
        }
        if (i10 == 1) {
            return JS_RUNNING;
        }
        if (i10 == 2) {
            return JS_SUCCESS;
        }
        if (i10 != 3) {
            return null;
        }
        return JS_FAILED;
    }

    @Override // com.google.protobuf.InterfaceC12151f0
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f46139Y;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
