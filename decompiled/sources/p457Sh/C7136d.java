package p457Sh;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p364Oh.C6226E;
import p556Wk.C8907V;
import p556Wk.C8922f;
import p604Yk.C10076a;
import p604Yk.C10077b;
import p604Yk.C10078c;
import p604Yk.C10086k;
import p857kl.AbstractC16435B;
import p857kl.AbstractC16449P;
import p857kl.AbstractC16457e;
import p857kl.C16460h;
import p929oi.AbstractC18201b;
import p971ql.C18767h;

/* JADX INFO: renamed from: Sh.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C7136d extends AbstractC16546n implements InterfaceC1436k {

    /* JADX INFO: renamed from: Z */
    public static final C7136d f22699Z = new C7136d(1, 0);

    /* JADX INFO: renamed from: o0 */
    public static final C7136d f22700o0 = new C7136d(1, 1);

    /* JADX INFO: renamed from: p0 */
    public static final C7136d f22701p0 = new C7136d(1, 2);

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f22702Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7136d(int i10, int i11) {
        super(i10);
        this.f22702Y = i11;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f22702Y) {
            case 0:
                C10078c install = (C10078c) obj;
                AbstractC16544l.m18094g(install, "$this$install");
                C16460h contentType = AbstractC16457e.f51060a;
                C18767h c18767h = new C18767h(AbstractC18201b.f58034a);
                AbstractC16544l.m18094g(contentType, "contentType");
                install.f29835b.add(new C10076a(c18767h, contentType, contentType.equals(contentType) ? C10086k.f29865Y : new C10077b(contentType, 0)));
                return c17296c;
            case 1:
                String header = (String) obj;
                AbstractC16544l.m18094g(header, "header");
                List list = AbstractC16435B.f50983a;
                return Boolean.valueOf(header.equals(SIPHeaderNames.AUTHORIZATION));
            case 2:
                C8907V install2 = (C8907V) obj;
                AbstractC16544l.m18094g(install2, "$this$install");
                C8907V.m9563a(10000L);
                install2.f27259b = 10000L;
                C8907V.m9563a(10000L);
                install2.f27260c = 10000L;
                return c17296c;
            default:
                C8922f defaultRequest = (C8922f) obj;
                AbstractC16544l.m18094g(defaultRequest, "$this$defaultRequest");
                AbstractC16449P.m18026b(defaultRequest.f27293b, "https://android.chat.openai.com/backend-anon/");
                return c17296c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7136d(C6226E c6226e) {
        super(1);
        this.f22702Y = 3;
    }
}
