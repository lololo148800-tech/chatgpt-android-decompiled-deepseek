package com.openai.design;

import kotlin.jvm.internal.AbstractC16544l;
import p478Tc.C7303g;
import p774h1.C14356l;
import p882m1.AbstractC17140a;

/* JADX INFO: renamed from: com.openai.design.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC12220a {
    /* JADX INFO: renamed from: a */
    public static AbstractC17140a m14230a(AbstractC17140a painter, C14356l c14356l) {
        C7303g c7303g = C7303g.f23138o0;
        AbstractC16544l.m18094g(painter, "painter");
        return new ForwardingPainter(painter, 1.0f, c14356l, c7303g);
    }
}
