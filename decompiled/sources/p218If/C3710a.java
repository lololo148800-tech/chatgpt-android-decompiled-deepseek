package p218If;

import java.util.Map;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17309l;
import p1081wc.AbstractC20882b;
import p1081wc.InterfaceC20904w;
import p337Nd.C5710c;
import p909nm.AbstractC17659D;
import p926of.C18173j;

/* JADX INFO: renamed from: If.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C3710a {

    /* JADX INFO: renamed from: a */
    public final C5710c f11257a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC20904w f11258b;

    public C3710a(C5710c c5710c, InterfaceC20904w interfaceC20904w) {
        this.f11257a = c5710c;
        this.f11258b = interfaceC20904w;
    }

    /* JADX INFO: renamed from: a */
    public final void m4413a(AbstractC20882b abstractC20882b, C18173j imageSelection, Map properties) {
        AbstractC16544l.m18094g(imageSelection, "imageSelection");
        AbstractC16544l.m18094g(properties, "properties");
        String str = imageSelection.f57969b;
        if (str == null) {
            return;
        }
        C5710c c5710c = this.f11257a;
        m4414b(abstractC20882b, c5710c.f18498a, imageSelection.f57971d, str, imageSelection.f57970c, imageSelection.f57968a, imageSelection.f57973f, properties);
    }

    /* JADX INFO: renamed from: b */
    public final void m4414b(AbstractC20882b abstractC20882b, String str, String str2, String str3, String str4, String str5, String str6, Map properties) {
        AbstractC16544l.m18094g(properties, "properties");
        if (str == null) {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        C17309l c17309l = new C17309l("conversationId", str);
        if (str2 == null) {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        C17309l c17309l2 = new C17309l("messageId", str2);
        if (str3 == null) {
            str3 = "";
        }
        C17309l c17309l3 = new C17309l("generationId", str3);
        if (str5 == null) {
            str5 = "";
        }
        C17309l c17309l4 = new C17309l("fileId", str5);
        if (str4 == null) {
            str4 = "";
        }
        C17309l c17309l5 = new C17309l("parentGenerationId", str4);
        if (str6 == null) {
            str6 = "";
        }
        this.f11258b.mo21447a(abstractC20882b, AbstractC17659D.m19248j(properties, AbstractC17659D.m19244f(c17309l, c17309l2, c17309l3, c17309l4, c17309l5, new C17309l("sourceOperation", str6))));
    }
}
