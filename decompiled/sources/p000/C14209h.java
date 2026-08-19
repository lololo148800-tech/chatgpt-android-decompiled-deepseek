package p000;

import android.content.Context;
import androidx.camera.view.PreviewView;
import androidx.lifecycle.InterfaceC11112u;
import com.openai.chatgpt.R;
import kotlin.jvm.internal.AbstractC16544l;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p178H.C3123P;
import p178H.C3142e0;
import p178H.C3163p;
import p178H.InterfaceC3140d0;
import p229J0.EnumC3898D3;
import p523V9.AbstractC8160o6;
import p536W.C8408d;
import p553Wh.C8870f;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;

/* JADX INFO: renamed from: h */
/* JADX INFO: loaded from: classes.dex */
public final class C14209h extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ C8408d f44621Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ C3142e0 f44622Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ PreviewView f44623o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC11112u f44624p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C3163p f44625q0;

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ C3123P f44626r0;

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ C8870f f44627s0;

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ Context f44628t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14209h(C8408d c8408d, C3142e0 c3142e0, PreviewView previewView, InterfaceC11112u interfaceC11112u, C3163p c3163p, C3123P c3123p, C8870f c8870f, Context context, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f44621Y = c8408d;
        this.f44622Z = c3142e0;
        this.f44623o0 = previewView;
        this.f44624p0 = interfaceC11112u;
        this.f44625q0 = c3163p;
        this.f44626r0 = c3123p;
        this.f44627s0 = c8870f;
        this.f44628t0 = context;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new C14209h(this.f44621Y, this.f44622Z, this.f44623o0, this.f44624p0, this.f44625q0, this.f44626r0, this.f44627s0, this.f44628t0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        C14209h c14209h = (C14209h) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2);
        C17296C c17296c = C17296C.f55119a;
        c14209h.invokeSuspend(c17296c);
        return c17296c;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        AbstractC9233X.m9807c(obj);
        C8408d c8408d = this.f44621Y;
        if (c8408d != null) {
            InterfaceC11112u interfaceC11112u = this.f44624p0;
            C3163p c3163p = this.f44625q0;
            C3123P c3123p = this.f44626r0;
            c8408d.m8961g();
            InterfaceC3140d0 surfaceProvider = this.f44623o0.getSurfaceProvider();
            C3142e0 c3142e0 = this.f44622Z;
            c3142e0.m3983C(surfaceProvider);
            try {
                c8408d.m8957c(interfaceC11112u, c3163p, c3142e0, c3123p);
            } catch (Exception e10) {
                AbstractC8160o6.m8727b(AbstractC17714o.f56552b, "Failed binding camera " + e10.getMessage(), null, 6);
                String string = this.f44628t0.getString(R.string.voice_cameras_error);
                AbstractC16544l.m18093f(string, "getString(...)");
                C8870f.m9548c(this.f44627s0, string, EnumC3898D3.f11877Y, 12);
            }
        }
        return C17296C.f55119a;
    }
}
