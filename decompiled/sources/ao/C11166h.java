package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.h */
/* JADX INFO: loaded from: classes2.dex */
public final class C11166h extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public byte[] f33807a;

    /* JADX INFO: renamed from: b */
    public int f33808b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        byte[] bArrCopyOf = Arrays.copyOf(this.f33807a, this.f33808b);
        AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        byte[] bArr = this.f33807a;
        if (bArr.length < i10) {
            int length = bArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            AbstractC16544l.m18093f(bArrCopyOf, "copyOf(...)");
            this.f33807a = bArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33808b;
    }
}
