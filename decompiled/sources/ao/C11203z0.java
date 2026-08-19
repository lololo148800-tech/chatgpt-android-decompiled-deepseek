package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17295B;

/* JADX INFO: renamed from: ao.z0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11203z0 extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public short[] f33871a;

    /* JADX INFO: renamed from: b */
    public int f33872b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        short[] sArrCopyOf = Arrays.copyOf(this.f33871a, this.f33872b);
        AbstractC16544l.m18093f(sArrCopyOf, "copyOf(...)");
        return new C17295B(sArrCopyOf);
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        short[] sArr = this.f33871a;
        if (sArr.length < i10) {
            int length = sArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            short[] sArrCopyOf = Arrays.copyOf(sArr, i10);
            AbstractC16544l.m18093f(sArrCopyOf, "copyOf(...)");
            this.f33871a = sArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33872b;
    }
}
