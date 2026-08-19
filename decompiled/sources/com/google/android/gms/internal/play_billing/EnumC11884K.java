package com.google.android.gms.internal.play_billing;

import bb.AbstractC11330w;
import java.util.Arrays;
import p013Ab.C0420b;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.K */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC11884K {
    RESPONSE_CODE_UNSPECIFIED(-999),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_TIMEOUT(-3),
    /* JADX INFO: Fake field, exist only in values array */
    FEATURE_NOT_SUPPORTED(-2),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_DISCONNECTED(-1),
    /* JADX INFO: Fake field, exist only in values array */
    EF45(0),
    /* JADX INFO: Fake field, exist only in values array */
    USER_CANCELED(1),
    /* JADX INFO: Fake field, exist only in values array */
    SERVICE_UNAVAILABLE(2),
    /* JADX INFO: Fake field, exist only in values array */
    BILLING_UNAVAILABLE(3),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_UNAVAILABLE(4),
    /* JADX INFO: Fake field, exist only in values array */
    DEVELOPER_ERROR(5),
    /* JADX INFO: Fake field, exist only in values array */
    ERROR(6),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_ALREADY_OWNED(7),
    /* JADX INFO: Fake field, exist only in values array */
    ITEM_NOT_OWNED(8),
    /* JADX INFO: Fake field, exist only in values array */
    EXPIRED_OFFER_TOKEN(11),
    /* JADX INFO: Fake field, exist only in values array */
    NETWORK_ERROR(12);


    /* JADX INFO: renamed from: o0 */
    public static final C11922X f36153o0;

    /* JADX INFO: renamed from: Y */
    public final int f36155Y;

    EnumC11884K(int i10) {
        this.f36155Y = i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        C0420b c0420b = new C0420b((char) (0 == true ? 1 : 0), 13);
        c0420b.f1382o0 = new Object[8];
        c0420b.f1381Z = 0;
        for (EnumC11884K enumC11884K : values()) {
            Integer numValueOf = Integer.valueOf(enumC11884K.f36155Y);
            int i10 = c0420b.f1381Z + 1;
            Object[] objArr = (Object[]) c0420b.f1382o0;
            int length = objArr.length;
            int i11 = i10 + i10;
            if (i11 > length) {
                c0420b.f1382o0 = Arrays.copyOf(objArr, AbstractC11330w.m12761h(length, i11));
            }
            Object[] objArr2 = (Object[]) c0420b.f1382o0;
            int i12 = c0420b.f1381Z;
            int i13 = i12 + i12;
            objArr2[i13] = numValueOf;
            objArr2[i13 + 1] = enumC11884K;
            c0420b.f1381Z = i12 + 1;
        }
        C11860C c11860c = (C11860C) c0420b.f1383p0;
        if (c11860c != null) {
            throw c11860c.m13258a();
        }
        C11922X c11922xM13361a = C11922X.m13361a(c0420b.f1381Z, (Object[]) c0420b.f1382o0, c0420b);
        C11860C c11860c2 = (C11860C) c0420b.f1383p0;
        if (c11860c2 != null) {
            throw c11860c2.m13258a();
        }
        f36153o0 = c11922xM13361a;
    }
}
