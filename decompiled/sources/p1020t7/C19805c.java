package p1020t7;

import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.AbstractC16544l;
import p1112xm.AbstractC21304h;
import p523V9.AbstractC7889G0;
import p661b7.EnumC11255b;
import p661b7.InterfaceC11256c;
import p909nm.AbstractC17681o;
import p943p7.C18304b;

/* JADX INFO: renamed from: t7.c */
/* JADX INFO: loaded from: classes.dex */
public final class C19805c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC11256c f62836a;

    public C19805c(InterfaceC11256c internalLogger) {
        AbstractC16544l.m18094g(internalLogger, "internalLogger");
        this.f62836a = internalLogger;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20763a(File target) {
        EnumC11255b enumC11255b = EnumC11255b.f34100o0;
        EnumC11255b enumC11255b2 = EnumC11255b.f34099Z;
        AbstractC16544l.m18094g(target, "target");
        try {
            return AbstractC21304h.m21640c(target);
        } catch (FileNotFoundException e10) {
            AbstractC7889G0.m8185c(this.f62836a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(target, 5), e10, 48);
            return false;
        } catch (SecurityException e11) {
            AbstractC7889G0.m8185c(this.f62836a, 5, AbstractC17681o.m19382k(enumC11255b2, enumC11255b), new C18304b(target, 6), e11, 48);
            return false;
        }
    }
}
