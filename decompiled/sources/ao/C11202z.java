package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;

/* JADX INFO: renamed from: ao.z */
/* JADX INFO: loaded from: classes2.dex */
public final class C11202z extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public float[] f33869a;

    /* JADX INFO: renamed from: b */
    public int f33870b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        float[] fArrCopyOf = Arrays.copyOf(this.f33869a, this.f33870b);
        AbstractC16544l.m18093f(fArrCopyOf, "copyOf(...)");
        return fArrCopyOf;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        float[] fArr = this.f33869a;
        if (fArr.length < i10) {
            int length = fArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            float[] fArrCopyOf = Arrays.copyOf(fArr, i10);
            AbstractC16544l.m18093f(fArrCopyOf, "copyOf(...)");
            this.f33869a = fArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33870b;
    }
}
