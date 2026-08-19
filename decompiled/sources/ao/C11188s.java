package ao;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC16544l;
import p160G5.p161rK.TVCuK;

/* JADX INFO: renamed from: ao.s */
/* JADX INFO: loaded from: classes2.dex */
public final class C11188s extends AbstractC11157c0 {

    /* JADX INFO: renamed from: a */
    public double[] f33839a;

    /* JADX INFO: renamed from: b */
    public int f33840b;

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: b */
    public final void mo12371b(int i10) {
        double[] dArr = this.f33839a;
        if (dArr.length < i10) {
            int length = dArr.length * 2;
            if (i10 < length) {
                i10 = length;
            }
            double[] dArrCopyOf = Arrays.copyOf(dArr, i10);
            AbstractC16544l.m18093f(dArrCopyOf, "copyOf(...)");
            this.f33839a = dArrCopyOf;
        }
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: d */
    public final int mo12372d() {
        return this.f33840b;
    }

    @Override // ao.AbstractC11157c0
    /* JADX INFO: renamed from: a */
    public final Object mo12370a() {
        double[] dArrCopyOf = Arrays.copyOf(this.f33839a, this.f33840b);
        AbstractC16544l.m18093f(dArrCopyOf, TVCuK.ZYFjTuvM);
        return dArrCopyOf;
    }
}
