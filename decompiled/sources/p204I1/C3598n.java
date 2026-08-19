package p204I1;

import android.graphics.Matrix;
import android.graphics.Path;
import cf.C11727c;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p001A.AbstractC0010F;
import p049Bm.InterfaceC1436k;
import p1095x1.AbstractC21068W;
import p1095x1.AbstractC21069X;
import p230J1.C4199z;
import p254K0.C4519p;
import p254K0.C4520q;
import p254K0.C4522s;
import p523V9.AbstractC8088f6;
import p537W0.C8410b;
import p759g1.C13800b;
import p774h1.C14353i;
import p909nm.AbstractC17680n;
import p909nm.AbstractC17681o;
import p911o0.AbstractC17792x;
import p936p0.C18265e;

/* JADX INFO: renamed from: I1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C3598n extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f10954Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ int f10955Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ int f10956o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ Object f10957p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3598n(int i10, int i11, InterfaceC1436k interfaceC1436k) {
        super(1);
        this.f10954Y = 2;
        this.f10955Z = i10;
        this.f10956o0 = i11;
        this.f10957p0 = interfaceC1436k;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        switch (this.f10954Y) {
            case 0:
                C3601q c3601q = (C3601q) obj;
                C3585a c3585a = c3601q.f10968a;
                int iM4319b = c3601q.m4319b(this.f10955Z);
                int iM4319b2 = c3601q.m4319b(this.f10956o0);
                CharSequence charSequence = c3585a.f10919e;
                if (iM4319b < 0 || iM4319b > iM4319b2 || iM4319b2 > charSequence.length()) {
                    StringBuilder sbM21e = AbstractC0010F.m21e("start(", iM4319b, ") or end(", iM4319b2, ") is out of range [0..");
                    sbM21e.append(charSequence.length());
                    sbM21e.append("], or start > end!");
                    throw new IllegalArgumentException(sbM21e.toString().toString());
                }
                Path path = new Path();
                C4199z c4199z = c3585a.f10918d;
                c4199z.f13640f.getSelectionPath(iM4319b, iM4319b2, path);
                int i10 = c4199z.f13642h;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i10);
                }
                long jM8536b = AbstractC8088f6.m8536b(0.0f, c3601q.f10973f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(C13800b.m15306g(jM8536b), C13800b.m15307h(jM8536b));
                path.transform(matrix);
                ((C14353i) this.f10957p0).f45039a.addPath(path, C13800b.m15306g(0L), C13800b.m15307h(0L));
                return C17296C.f55119a;
            case 1:
                C4522s c4522s = (C4522s) obj;
                ArrayList arrayListM19323D0 = AbstractC17680n.m19323D0((C4520q) this.f10957p0);
                int i11 = this.f10955Z;
                C4519p c4519p = (C4519p) arrayListM19323D0.get(i11);
                arrayListM19323D0.remove(i11);
                arrayListM19323D0.add(this.f10956o0, c4519p);
                int size = arrayListM19323D0.size();
                for (int i12 = 0; i12 < size; i12++) {
                    C4519p c4519p2 = (C4519p) arrayListM19323D0.get(i12);
                    c4522s.m5264a(c4519p2.f14762a, c4519p2.f14766e);
                }
                return C17296C.f55119a;
            case 2:
                C18265e LazyRow = (C18265e) obj;
                AbstractC16544l.m18094g(LazyRow, "$this$LazyRow");
                int i13 = this.f10955Z;
                if (1 <= i13) {
                    int i14 = 1;
                    while (true) {
                        int i15 = this.f10956o0;
                        InterfaceC1436k interfaceC1436k = (InterfaceC1436k) this.f10957p0;
                        if (i14 <= i15) {
                            AbstractC17792x.m19528k(LazyRow, null, new C8410b(new C11727c(i14, 0, interfaceC1436k), true, 1108165242), 3);
                        } else {
                            AbstractC17792x.m19528k(LazyRow, null, new C8410b(new C11727c(i14, 1, interfaceC1436k), true, -278066159), 3);
                        }
                        if (i14 != i13) {
                            i14++;
                        }
                    }
                }
                return C17296C.f55119a;
            default:
                AbstractC21068W layout = (AbstractC21068W) obj;
                AbstractC16544l.m18094g(layout, "$this$layout");
                int i16 = 0;
                for (Object obj2 : (ArrayList) this.f10957p0) {
                    int i17 = i16 + 1;
                    if (i16 < 0) {
                        AbstractC17681o.m19388q();
                        throw null;
                    }
                    layout.m21546g((AbstractC21069X) obj2, (this.f10955Z - this.f10956o0) * i16, 0, 1 - (i16 / 100.0f));
                    i16 = i17;
                }
                return C17296C.f55119a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3598n(Object obj, int i10, int i11, int i12) {
        super(1);
        this.f10954Y = i12;
        this.f10957p0 = obj;
        this.f10955Z = i10;
        this.f10956o0 = i11;
    }
}
