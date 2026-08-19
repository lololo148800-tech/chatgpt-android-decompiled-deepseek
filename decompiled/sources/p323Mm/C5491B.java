package p323Mm;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import p909nm.C17689w;

/* JADX INFO: renamed from: Mm.B */
/* JADX INFO: loaded from: classes2.dex */
public final class C5491B implements InterfaceC5500g {

    /* JADX INFO: renamed from: a */
    public static final C5491B f17924a = new C5491B();

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: a */
    public final List mo5916a() {
        return C17689w.f56480Y;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Member mo5917b() {
        return null;
    }

    @Override // p323Mm.InterfaceC5500g
    /* JADX INFO: renamed from: c */
    public final boolean mo5918c() {
        return false;
    }

    @Override // p323Mm.InterfaceC5500g
    public final Object call(Object[] args) {
        AbstractC16544l.m18094g(args, "args");
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p323Mm.InterfaceC5500g
    public final Type getReturnType() {
        Class TYPE = Void.TYPE;
        AbstractC16544l.m18093f(TYPE, "TYPE");
        return TYPE;
    }
}
