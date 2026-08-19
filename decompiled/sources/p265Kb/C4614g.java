package p265Kb;

import com.google.gson.reflect.TypeToken;
import java.io.IOException;
import p214Ib.AbstractC3656B;
import p214Ib.C3669l;
import p379Pb.C6381b;
import p379Pb.C6382c;

/* JADX INFO: renamed from: Kb.g */
/* JADX INFO: loaded from: classes.dex */
public final class C4614g extends AbstractC3656B {

    /* JADX INFO: renamed from: a */
    public AbstractC3656B f15036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f15037b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f15038c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C3669l f15039d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ TypeToken f15040e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C4615h f15041f;

    public C4614g(C4615h c4615h, boolean z6, boolean z10, C3669l c3669l, TypeToken typeToken) {
        this.f15041f = c4615h;
        this.f15037b = z6;
        this.f15038c = z10;
        this.f15039d = c3669l;
        this.f15040e = typeToken;
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: a */
    public final Object mo4358a(C6381b c6381b) throws IOException {
        if (this.f15037b) {
            c6381b.mo5613D();
            return null;
        }
        AbstractC3656B abstractC3656BM4373g = this.f15036a;
        if (abstractC3656BM4373g == null) {
            abstractC3656BM4373g = this.f15039d.m4373g(this.f15041f, this.f15040e);
            this.f15036a = abstractC3656BM4373g;
        }
        return abstractC3656BM4373g.mo4358a(c6381b);
    }

    @Override // p214Ib.AbstractC3656B
    /* JADX INFO: renamed from: b */
    public final void mo4359b(C6382c c6382c, Object obj) throws IOException {
        if (this.f15038c) {
            c6382c.m7016W();
            return;
        }
        AbstractC3656B abstractC3656BM4373g = this.f15036a;
        if (abstractC3656BM4373g == null) {
            abstractC3656BM4373g = this.f15039d.m4373g(this.f15041f, this.f15040e);
            this.f15036a = abstractC3656BM4373g;
        }
        abstractC3656BM4373g.mo4359b(c6382c, obj);
    }
}
