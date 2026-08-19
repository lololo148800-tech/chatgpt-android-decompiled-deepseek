package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17318u;

/* JADX INFO: renamed from: ao.q0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C11185q0 extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public byte[] f33835a;

    /* JADX INFO: renamed from: b */
    public int f33836b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f33835a, this.f33836b);
        AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
        return new C17318u(bArrCopyOf);
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        byte[] bArr = this.f33835a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
            this.f33835a = bArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33836b;
    }
}
