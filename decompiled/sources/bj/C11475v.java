package bj;

import java.io.IOException;
import p026Ao.AbstractC0668b;
import p026Ao.C0653B;
import p026Ao.C0675i;
import p026Ao.C0678l;

/* JADX INFO: renamed from: bj.v */
/* JADX INFO: loaded from: classes3.dex */
public final class C11475v {

    /* JADX INFO: renamed from: a */
    public final String[] f34684a;

    /* JADX INFO: renamed from: b */
    public final C0653B f34685b;

    public C11475v(String[] strArr, C0653B c0653b) {
        this.f34684a = strArr;
        this.f34685b = c0653b;
    }

    /* JADX INFO: renamed from: a */
    public static C11475v m12866a(String... strArr) {
        try {
            C0678l[] c0678lArr = new C0678l[strArr.length];
            C0675i c0675i = new C0675i();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                C11479z.m12882b1(c0675i, strArr[i10]);
                c0675i.readByte();
                c0678lArr[i10] = c0675i.m1417C0(c0675i.f1970Z);
            }
            return new C11475v((String[]) strArr.clone(), AbstractC0668b.m1407g(c0678lArr));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
