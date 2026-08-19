package p544W9;

import androidx.compose.foundation.BorderModifierNodeElement;
import kotlin.jvm.internal.AbstractC16544l;
import p225Im.C3743B;
import p225Im.EnumC3744C;
import p225Im.InterfaceC3777y;
import p523V9.AbstractC8072d6;
import p635a1.InterfaceC10459q;
import p759g1.AbstractC13799a;
import p774h1.C14341T;
import p774h1.InterfaceC14339Q;

/* JADX INFO: renamed from: W9.A */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8443A {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC10459q m9045a(InterfaceC10459q interfaceC10459q, float f10, long j10, InterfaceC14339Q interfaceC14339Q) {
        return interfaceC10459q.mo428M(new BorderModifierNodeElement(f10, new C14341T(j10), interfaceC14339Q));
    }

    /* JADX INFO: renamed from: b */
    public static C3743B m9046b(InterfaceC3777y type) {
        AbstractC16544l.m18094g(type, "type");
        return new C3743B(EnumC3744C.f11394Y, type);
    }

    /* JADX INFO: renamed from: c */
    public static final long m9047c(float f10, long j10) {
        return AbstractC8072d6.m8484a(Math.max(0.0f, AbstractC13799a.m15297b(j10) - f10), Math.max(0.0f, AbstractC13799a.m15298c(j10) - f10));
    }
}
