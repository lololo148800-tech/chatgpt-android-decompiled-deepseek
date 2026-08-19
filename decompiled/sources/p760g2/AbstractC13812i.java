package p760g2;

import java.util.ArrayList;
import java.util.Arrays;
import p775h2.AbstractC14379i;
import p775h2.C14385o;

/* JADX INFO: renamed from: g2.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC13812i extends C13807d {

    /* JADX INFO: renamed from: r0 */
    public C13807d[] f43780r0 = new C13807d[4];

    /* JADX INFO: renamed from: s0 */
    public int f43781s0 = 0;

    /* JADX INFO: renamed from: U */
    public final void m15415U(C13807d c13807d) {
        if (c13807d == this || c13807d == null) {
            return;
        }
        int i10 = this.f43781s0 + 1;
        C13807d[] c13807dArr = this.f43780r0;
        if (i10 > c13807dArr.length) {
            this.f43780r0 = (C13807d[]) Arrays.copyOf(c13807dArr, c13807dArr.length * 2);
        }
        C13807d[] c13807dArr2 = this.f43780r0;
        int i11 = this.f43781s0;
        c13807dArr2[i11] = c13807d;
        this.f43781s0 = i11 + 1;
    }

    /* JADX INFO: renamed from: V */
    public final void m15416V(int i10, C14385o c14385o, ArrayList arrayList) {
        for (int i11 = 0; i11 < this.f43781s0; i11++) {
            C13807d c13807d = this.f43780r0[i11];
            ArrayList arrayList2 = c14385o.f45099a;
            if (!arrayList2.contains(c13807d)) {
                arrayList2.add(c13807d);
            }
        }
        for (int i12 = 0; i12 < this.f43781s0; i12++) {
            AbstractC14379i.m15865b(this.f43780r0[i12], i10, arrayList, c14385o);
        }
    }

    /* JADX INFO: renamed from: W */
    public void mo15409W() {
    }
}
