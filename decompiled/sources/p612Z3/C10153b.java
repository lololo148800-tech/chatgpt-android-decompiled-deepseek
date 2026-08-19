package p612Z3;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import p1016t3.C19753C;
import p1073w3.C20811m;
import p372P3.C6318J;
import p589Y3.C9643a;
import p594Y9.AbstractC9997x4;
import p638a4.C10501a;
import p644ab.AbstractC10531d;

/* JADX INFO: renamed from: Z3.b */
/* JADX INFO: loaded from: classes.dex */
public final class C10153b extends AbstractC9997x4 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f30083a;

    @Override // p594Y9.AbstractC9997x4
    /* JADX INFO: renamed from: d */
    public final C19753C mo10641d(C9643a c9643a, ByteBuffer byteBuffer) {
        switch (this.f30083a) {
            case 0:
                if (byteBuffer.get() == 116) {
                    C6318J c6318j = new C6318J(byteBuffer.limit(), byteBuffer.array());
                    int i10 = 12;
                    c6318j.m6883t(12);
                    int iM6869f = (c6318j.m6869f() + c6318j.m6872i(12)) - 4;
                    c6318j.m6883t(44);
                    c6318j.m6884u(c6318j.m6872i(12));
                    c6318j.m6883t(16);
                    ArrayList arrayList = new ArrayList();
                    while (c6318j.m6869f() < iM6869f) {
                        c6318j.m6883t(48);
                        int iM6872i = c6318j.m6872i(8);
                        c6318j.m6883t(4);
                        int iM6869f2 = c6318j.m6869f() + c6318j.m6872i(i10);
                        String str = null;
                        String str2 = null;
                        while (c6318j.m6869f() < iM6869f2) {
                            int iM6872i2 = c6318j.m6872i(8);
                            int iM6872i3 = c6318j.m6872i(8);
                            int iM6869f3 = c6318j.m6869f() + iM6872i3;
                            if (iM6872i2 == 2) {
                                int iM6872i4 = c6318j.m6872i(16);
                                c6318j.m6883t(8);
                                if (iM6872i4 == 3) {
                                    while (c6318j.m6869f() < iM6869f3) {
                                        int iM6872i5 = c6318j.m6872i(8);
                                        Charset charset = AbstractC10531d.f31240a;
                                        byte[] bArr = new byte[iM6872i5];
                                        c6318j.m6875l(iM6872i5, bArr);
                                        String str3 = new String(bArr, charset);
                                        int iM6872i6 = c6318j.m6872i(8);
                                        for (int i11 = 0; i11 < iM6872i6; i11++) {
                                            c6318j.m6884u(c6318j.m6872i(8));
                                        }
                                        str = str3;
                                    }
                                }
                            } else if (iM6872i2 == 21) {
                                Charset charset2 = AbstractC10531d.f31240a;
                                byte[] bArr2 = new byte[iM6872i3];
                                c6318j.m6875l(iM6872i3, bArr2);
                                str2 = new String(bArr2, charset2);
                            }
                            c6318j.m6880q(iM6869f3 * 8);
                        }
                        c6318j.m6880q(iM6869f2 * 8);
                        if (str != null && str2 != null) {
                            arrayList.add(new C10152a(iM6872i, str.concat(str2)));
                        }
                        i10 = 12;
                    }
                    if (!arrayList.isEmpty()) {
                        return new C19753C(arrayList);
                    }
                }
                return null;
            default:
                C20811m c20811m = new C20811m(byteBuffer.limit(), byteBuffer.array());
                String strM21360o = c20811m.m21360o();
                strM21360o.getClass();
                String strM21360o2 = c20811m.m21360o();
                strM21360o2.getClass();
                return new C19753C(new C10501a(strM21360o, strM21360o2, c20811m.m21359n(), c20811m.m21359n(), Arrays.copyOfRange(c20811m.f66092a, c20811m.f66093b, c20811m.f66094c)));
        }
    }
}
