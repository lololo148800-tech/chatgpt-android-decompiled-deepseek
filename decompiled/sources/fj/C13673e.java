package fj;

import kotlin.jvm.internal.AbstractC16544l;
import p049Bm.InterfaceC1436k;
import p523V9.AbstractC8215v5;
import p729ej.AbstractC13422m;

/* JADX INFO: renamed from: fj.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C13673e implements InterfaceC13670b {

    /* JADX INFO: renamed from: a */
    public final AbstractC13422m f43152a;

    /* JADX INFO: renamed from: b */
    public InterfaceC1436k f43153b;

    /* JADX INFO: renamed from: c */
    public final C13676h f43154c;

    /* JADX INFO: renamed from: d */
    public C13673e f43155d;

    public C13673e(AbstractC13422m workflow, InterfaceC1436k handler, C13676h c13676h) {
        AbstractC16544l.m18094g(workflow, "workflow");
        AbstractC16544l.m18094g(handler, "handler");
        this.f43152a = workflow;
        this.f43153b = handler;
        this.f43154c = c13676h;
    }

    @Override // fj.InterfaceC13670b
    /* JADX INFO: renamed from: a */
    public final InterfaceC13670b mo15160a() {
        return this.f43155d;
    }

    @Override // fj.InterfaceC13670b
    /* JADX INFO: renamed from: b */
    public final void mo15161b(InterfaceC13670b interfaceC13670b) {
        this.f43155d = (C13673e) interfaceC13670b;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15162c(AbstractC13422m otherWorkflow, String key) {
        AbstractC16544l.m18094g(otherWorkflow, "otherWorkflow");
        AbstractC16544l.m18094g(key, "key");
        C13677i c13677i = this.f43154c.f43159Y;
        c13677i.getClass();
        return AbstractC16544l.m18089b(c13677i.f43170a, AbstractC8215v5.m8842d(otherWorkflow)) && AbstractC16544l.m18089b(c13677i.f43171b, key);
    }
}
