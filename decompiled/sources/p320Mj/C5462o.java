package p320Mj;

import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p228J.AbstractC3794B0;

/* JADX INFO: renamed from: Mj.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C5462o {

    /* JADX INFO: renamed from: a */
    public final List f17834a;

    /* JADX INFO: renamed from: b */
    public int f17835b;

    /* JADX INFO: renamed from: c */
    public final String f17836c;

    /* JADX INFO: renamed from: d */
    public final String f17837d;

    public C5462o(List steps, String str) {
        AbstractC16544l.m18094g(steps, "steps");
        this.f17834a = steps;
        this.f17836c = AbstractC3794B0.m4498w("toString(...)");
        this.f17837d = "Bearer ".concat(str);
    }
}
