package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17322y;
import p658b5.p659zh.MMVKXkcLpuHFDi;

/* JADX INFO: renamed from: ao.w0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11197w0 extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public long[] f33858a;

    /* JADX INFO: renamed from: b */
    public int f33859b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        long[] jArrCopyOf = Arrays.copyOf(this.f33858a, this.f33859b);
        AbstractC16544l.m18093f(jArrCopyOf, "copyOf(...)");
        return new C17322y(jArrCopyOf);
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33859b;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        long[] jArr = this.f33858a;
        if (jArr.length < i10) {
            int length = jArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
            AbstractC16544l.m18093f(jArrCopyOf, MMVKXkcLpuHFDi.tPyqHwxcJ);
            this.f33858a = jArrCopyOf;
        }
    }
}
