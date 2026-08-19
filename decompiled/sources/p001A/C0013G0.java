package p001A;

import android.util.Size;
import bb.AbstractC11293S;
import bb.AbstractC11328u;
import bb.C11326s;
import io.sentry.InterfaceC15154Q;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p003A1.C0198Q;
import p1016t3.C19788o;
import p1032u4.C20109c;
import p1032u4.C20110d;
import p1140z1.C21658D;
import p228J.C3828c;
import p281L3.C4918e;
import p281L3.C4919f;
import p281L3.C4924k;
import p281L3.C4927n;
import p281L3.C4928o;
import p305M3.C5293m;
import p349O0.C5962L;
import p898n4.C17479d;

/* JADX INFO: renamed from: A.G0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0013G0 implements Comparator {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f52Y;

    public /* synthetic */ C0013G0(int i10) {
        this.f52Y = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 10;
        int i11 = 11;
        switch (this.f52Y) {
            case 0:
                Size size = (Size) obj;
                Size size2 = (Size) obj2;
                return Long.signum((((long) size.getWidth()) * ((long) size.getHeight())) - (((long) size2.getWidth()) * ((long) size2.getHeight())));
            case 1:
                return ((Number) C0198Q.f736Z.invoke(obj, obj2)).intValue();
            case 2:
                return ((C3828c) obj).f11593a.compareTo(((C3828c) obj2).f11593a);
            case 3:
                C17309l c17309l = (C17309l) obj;
                C17309l c17309l2 = (C17309l) obj2;
                return (((Number) c17309l.f55137Z).intValue() - ((Number) c17309l.f55136Y).intValue()) - (((Number) c17309l2.f55137Z).intValue() - ((Number) c17309l2.f55136Y).intValue());
            case 4:
                return ((C19788o) obj2).f62748i - ((C19788o) obj).f62748i;
            case 5:
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num.intValue() == -1) {
                    return num2.intValue() == -1 ? 0 : -1;
                }
                if (num2.intValue() == -1) {
                    return 1;
                }
                return num.intValue() - num2.intValue();
            case 6:
                return Integer.compare(((C4919f) ((List) obj).get(0)).f16034r0, ((C4919f) ((List) obj2).get(0)).f16034r0);
            case 7:
                return ((C4918e) Collections.max((List) obj)).compareTo((C4918e) Collections.max((List) obj2));
            case 8:
                List list = (List) obj;
                List list2 = (List) obj2;
                return C11326s.m12754f(C4927n.m5533c((C4927n) Collections.max(list, new C0013G0(i10)), (C4927n) Collections.max(list2, new C0013G0(i10)))).mo12755a(list.size(), list2.size()).mo12756b((C4927n) Collections.max(list, new C0013G0(i11)), (C4927n) Collections.max(list2, new C0013G0(i11)), new C0013G0(i11)).mo12759e();
            case 9:
                return ((C4924k) ((List) obj).get(0)).compareTo((C4924k) ((List) obj2).get(0));
            case 10:
                return C4927n.m5533c((C4927n) obj, (C4927n) obj2);
            case 11:
                C4927n c4927n = (C4927n) obj;
                C4927n c4927n2 = (C4927n) obj2;
                AbstractC11293S abstractC11293SMo12712a = (c4927n.f16075q0 && c4927n.f16078t0) ? C4928o.f16085i : C4928o.f16085i.mo12712a();
                C11326s c11326s = AbstractC11328u.f34256a;
                c4927n.f16076r0.getClass();
                return c11326s.mo12756b(Integer.valueOf(c4927n.f16081w0), Integer.valueOf(c4927n2.f16081w0), abstractC11293SMo12712a).mo12756b(Integer.valueOf(c4927n.f16080v0), Integer.valueOf(c4927n2.f16080v0), abstractC11293SMo12712a).mo12759e();
            case 12:
                return ((C5293m) obj).f17447a - ((C5293m) obj2).f17447a;
            case 13:
                return Float.compare(((C5293m) obj).f17449c, ((C5293m) obj2).f17449c);
            case 14:
                return AbstractC16544l.m18096i(((C5962L) obj).f19408b, ((C5962L) obj2).f19408b);
            case 15:
                InterfaceC15154Q interfaceC15154Q = (InterfaceC15154Q) obj;
                InterfaceC15154Q interfaceC15154Q2 = (InterfaceC15154Q) obj2;
                int iCompareTo = interfaceC15154Q.mo16292w().compareTo(interfaceC15154Q2.mo16292w());
                return iCompareTo != 0 ? iCompareTo : interfaceC15154Q.mo16288s().f47145Z.f47155Y.compareTo(interfaceC15154Q2.mo16288s().f47145Z.f47155Y);
            case 16:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 17:
                return Integer.compare(((C17479d) obj2).f55890b, ((C17479d) obj).f55890b);
            case 18:
                return Integer.compare(((C20110d) obj).f63715a.f63718b, ((C20110d) obj2).f63715a.f63718b);
            case 19:
                return Long.compare(((C20109c) obj).f63712b, ((C20109c) obj2).f63712b);
            case 20:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr != bArr2) {
                    if (bArr == null) {
                        return -1;
                    }
                    if (bArr2 == null) {
                        return 1;
                    }
                    for (int i12 = 0; i12 < Math.min(bArr.length, bArr2.length); i12++) {
                        byte b = bArr[i12];
                        byte b10 = bArr2[i12];
                        if (b != b10) {
                            return b - b10;
                        }
                    }
                    if (bArr.length != bArr2.length) {
                        return bArr.length - bArr2.length;
                    }
                }
                return 0;
            case 21:
                byte[] bArr3 = (byte[]) obj;
                byte[] bArr4 = (byte[]) obj2;
                if (bArr3.length != bArr4.length) {
                    return bArr3.length - bArr4.length;
                }
                for (int i13 = 0; i13 < bArr3.length; i13++) {
                    byte b11 = bArr3[i13];
                    byte b12 = bArr4[i13];
                    if (b11 != b12) {
                        return b11 - b12;
                    }
                }
                return 0;
            default:
                C21658D c21658d = (C21658D) obj;
                C21658D c21658d2 = (C21658D) obj2;
                return c21658d.m22012J() == c21658d2.m22012J() ? AbstractC16544l.m18096i(c21658d.m22010H(), c21658d2.m22010H()) : Float.compare(c21658d.m22012J(), c21658d2.m22012J());
        }
    }
}
