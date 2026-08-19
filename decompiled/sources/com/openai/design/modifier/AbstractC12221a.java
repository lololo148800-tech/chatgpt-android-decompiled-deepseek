package com.openai.design.modifier;

import kotlin.jvm.internal.AbstractC16544l;
import p492U1.C7545j;
import p523V9.AbstractC8079e5;
import p571X9.AbstractC9113C4;
import p635a1.InterfaceC10459q;
import p758g0.AbstractC13758e;
import p758g0.AbstractC13795w0;
import p758g0.C13746W;

/* JADX INFO: renamed from: com.openai.design.modifier.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12221a {

    /* JADX INFO: renamed from: a */
    public static final long f37249a = AbstractC9113C4.m9643a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: a */
    public static InterfaceC10459q m14231a(InterfaceC10459q interfaceC10459q, C13746W animationSpec, int i10) {
        if ((i10 & 1) != 0) {
            Object obj = AbstractC13795w0.f43580a;
            animationSpec = AbstractC13758e.m15254s(0.0f, 400.0f, new C7545j(AbstractC9113C4.m9643a(1, 1)), 1);
        }
        AbstractC16544l.m18094g(interfaceC10459q, "<this>");
        AbstractC16544l.m18094g(animationSpec, "animationSpec");
        return AbstractC8079e5.m8502b(interfaceC10459q).mo428M(new SizeAnimationModifierElement(animationSpec, null));
    }
}
