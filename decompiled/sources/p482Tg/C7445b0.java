package p482Tg;

import af.InterfaceC10551G;
import af.InterfaceC10581i;
import af.InterfaceC10597y;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import com.openai.feature.conversations.impl.compliance.ComplianceViewModel;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.gizmos.impl.settings.GizmoSettingsViewModel;
import com.openai.feature.gizmos.impl.store.GizmoPreviewViewModel;
import com.openai.feature.gizmos.impl.store.GizmoRatingViewModel;
import com.openai.feature.gizmos.impl.store.GizmoStoreViewModel;
import com.openai.feature.gizmoshome.details.SnorlaxHomeViewModel;
import com.openai.feature.gizmoshome.impl.edit.SnorlaxEditViewModel;
import com.openai.feature.gizmoshome.impl.snorlax.SnorlaxListViewModel;
import com.openai.feature.messages.MessagesViewModel;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.openai.feature.onboarding.LoginViewModel;
import com.openai.feature.settings.impl.settings.SettingsViewModel;
import com.openai.feature.sharing.ShareConversationViewModel;
import com.openai.feature.sharing.ViewSharedConversationViewModel;
import com.openai.feature.subscriptions.SubscriptionsViewModel;
import ee.InterfaceC13368c;
import fj.C13676h;
import ge.InterfaceC14052T;
import gf.InterfaceC14124i;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.name.Name;
import mm.C17296C;
import mo.C17355v;
import mo.C17356w;
import no.AbstractC17708b;
import np.InterfaceC17710b;
import p049Bm.InterfaceC1436k;
import p1025te.InterfaceC19862M;
import p1140z1.AbstractC21690f;
import p117Eb.C2391u;
import p509Uk.C7709b;
import p509Uk.C7713f;
import p552Wg.InterfaceC8855q;
import p552Wg.InterfaceC8862x;
import p556Wk.AbstractC8910Y;
import p556Wk.C8907V;
import p563X1.AbstractC9031k;
import p563X1.ViewTreeObserverOnGlobalFocusChangeListenerC9035o;
import p622Ze.InterfaceC10297o;
import p623Zf.AbstractC10323s;
import p624Zg.C10373i0;
import p706df.InterfaceC13096p;
import p729ej.AbstractC13422m;
import p729ej.AbstractC13431v;
import p737f1.AbstractC13512d;
import p737f1.C13510b;
import p737f1.C13522n;
import p737f1.InterfaceC13515g;
import p751ff.InterfaceC13636g;
import p759g1.C13800b;
import p858ko.C16484C;
import p926of.InterfaceC18159W;
import pf.InterfaceC18393i;

/* JADX INFO: renamed from: Tg.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C7445b0 extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f23564Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7445b0(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f23564Y = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        C17296C c17296c = C17296C.f55119a;
        switch (this.f23564Y) {
            case 0:
                InterfaceC7436U p10 = (InterfaceC7436U) obj;
                AbstractC16544l.m18094g(p10, "p0");
                ((SettingsViewModel) this.receiver).m14395k(p10);
                return c17296c;
            case 1:
                C8907V c8907v = (C8907V) obj;
                C7709b c7709b = ((C7713f) this.receiver).f24303p0;
                c7709b.getClass();
                C17355v c17355vM19034a = ((C17356w) C7713f.f24302u0.getValue()).m19034a();
                c17355vM19034a.f55315a = new C2391u(19);
                c7709b.f24286a.invoke(c17355vM19034a);
                if (c8907v != null) {
                    Long l4 = c8907v.f27259b;
                    if (l4 != null) {
                        long jLongValue = l4.longValue();
                        InterfaceC17710b interfaceC17710b = AbstractC8910Y.f27266a;
                        if (jLongValue == Long.MAX_VALUE) {
                            jLongValue = 0;
                        }
                        c17355vM19034a.m19031a(jLongValue, TimeUnit.MILLISECONDS);
                    }
                    Long l10 = c8907v.f27260c;
                    if (l10 != null) {
                        long jLongValue2 = l10.longValue();
                        InterfaceC17710b interfaceC17710b2 = AbstractC8910Y.f27266a;
                        long j10 = jLongValue2 == Long.MAX_VALUE ? 0L : jLongValue2;
                        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                        c17355vM19034a.m19033c(j10, timeUnit);
                        c17355vM19034a.f55340z = AbstractC17708b.m19410b(jLongValue2 != Long.MAX_VALUE ? jLongValue2 : 0L, timeUnit);
                    }
                }
                return new C17356w(c17355vM19034a);
            case 2:
                InterfaceC8855q p11 = (InterfaceC8855q) obj;
                AbstractC16544l.m18094g(p11, "p0");
                ((ShareConversationViewModel) this.receiver).m14395k(p11);
                return c17296c;
            case 3:
                InterfaceC8862x p12 = (InterfaceC8862x) obj;
                AbstractC16544l.m18094g(p12, "p0");
                ((ViewSharedConversationViewModel) this.receiver).m14395k(p12);
                return c17296c;
            case 4:
                int i10 = ((C13510b) obj).f42774a;
                ViewTreeObserverOnGlobalFocusChangeListenerC9035o viewTreeObserverOnGlobalFocusChangeListenerC9035o = (ViewTreeObserverOnGlobalFocusChangeListenerC9035o) this.receiver;
                viewTreeObserverOnGlobalFocusChangeListenerC9035o.getClass();
                View viewM9601c = AbstractC9031k.m9601c(viewTreeObserverOnGlobalFocusChangeListenerC9035o);
                if (viewM9601c.isFocused() || viewM9601c.hasFocus()) {
                    return C13522n.f42803b;
                }
                return AbstractC13512d.m15032E(viewM9601c, AbstractC13512d.m15037J(i10), AbstractC9031k.m9600b(AbstractC21690f.m22218w(viewTreeObserverOnGlobalFocusChangeListenerC9035o).getFocusOwner(), (View) AbstractC21690f.m22218w(viewTreeObserverOnGlobalFocusChangeListenerC9035o), viewM9601c)) ? C13522n.f42803b : C13522n.f42804c;
            case 5:
                int i11 = ((C13510b) obj).f42774a;
                ViewTreeObserverOnGlobalFocusChangeListenerC9035o viewTreeObserverOnGlobalFocusChangeListenerC9035o2 = (ViewTreeObserverOnGlobalFocusChangeListenerC9035o) this.receiver;
                viewTreeObserverOnGlobalFocusChangeListenerC9035o2.getClass();
                View viewM9601c2 = AbstractC9031k.m9601c(viewTreeObserverOnGlobalFocusChangeListenerC9035o2);
                if (!viewM9601c2.hasFocus()) {
                    return C13522n.f42803b;
                }
                InterfaceC13515g focusOwner = AbstractC21690f.m22218w(viewTreeObserverOnGlobalFocusChangeListenerC9035o2).getFocusOwner();
                View view = (View) AbstractC21690f.m22218w(viewTreeObserverOnGlobalFocusChangeListenerC9035o2);
                if (!(viewM9601c2 instanceof ViewGroup)) {
                    if (view.requestFocus()) {
                        return C13522n.f42803b;
                    }
                    throw new IllegalStateException("host view did not take focus");
                }
                Rect rectM9600b = AbstractC9031k.m9600b(focusOwner, view, viewM9601c2);
                Integer numM15037J = AbstractC13512d.m15037J(i11);
                int iIntValue = numM15037J != null ? numM15037J.intValue() : 130;
                FocusFinder focusFinder = FocusFinder.getInstance();
                View view2 = viewTreeObserverOnGlobalFocusChangeListenerC9035o2.f27588z0;
                View viewFindNextFocus = view2 != null ? focusFinder.findNextFocus((ViewGroup) view, view2, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) view, rectM9600b, iIntValue);
                if (viewFindNextFocus != null && AbstractC9031k.m9599a(viewM9601c2, viewFindNextFocus)) {
                    viewFindNextFocus.requestFocus(iIntValue, rectM9600b);
                    return C13522n.f42804c;
                }
                if (view.requestFocus()) {
                    return C13522n.f42803b;
                }
                throw new IllegalStateException("host view did not take focus");
            case 6:
                Name p13 = (Name) obj;
                AbstractC16544l.m18094g(p13, "p0");
                return ((LazyJavaClassMemberScope) this.receiver).m18195B(p13);
            case 7:
                Name p14 = (Name) obj;
                AbstractC16544l.m18094g(p14, "p0");
                return ((LazyJavaClassMemberScope) this.receiver).m18196C(p14);
            case 8:
                InterfaceC10297o p15 = (InterfaceC10297o) obj;
                AbstractC16544l.m18094g(p15, "p0");
                ((GizmoSettingsViewModel) this.receiver).m14395k(p15);
                return c17296c;
            case 9:
                InterfaceC10297o p16 = (InterfaceC10297o) obj;
                AbstractC16544l.m18094g(p16, "p0");
                ((GizmoSettingsViewModel) this.receiver).m14395k(p16);
                return c17296c;
            case 10:
                C10373i0 p17 = (C10373i0) obj;
                AbstractC16544l.m18094g(p17, "p0");
                ((SubscriptionsViewModel) this.receiver).m14395k(p17);
                return c17296c;
            case 11:
                InterfaceC10581i p18 = (InterfaceC10581i) obj;
                AbstractC16544l.m18094g(p18, "p0");
                ((GizmoPreviewViewModel) this.receiver).m14395k(p18);
                return c17296c;
            case 12:
                InterfaceC10597y p19 = (InterfaceC10597y) obj;
                AbstractC16544l.m18094g(p19, "p0");
                ((GizmoRatingViewModel) this.receiver).m14395k(p19);
                return c17296c;
            case 13:
                InterfaceC10551G p20 = (InterfaceC10551G) obj;
                AbstractC16544l.m18094g(p20, "p0");
                ((GizmoStoreViewModel) this.receiver).m14395k(p20);
                return c17296c;
            case 14:
                AbstractC10323s p21 = (AbstractC10323s) obj;
                AbstractC16544l.m18094g(p21, "p0");
                ((LoginViewModel) this.receiver).m14395k(p21);
                return c17296c;
            case 15:
                InterfaceC13096p p22 = (InterfaceC13096p) obj;
                AbstractC16544l.m18094g(p22, "p0");
                ((SnorlaxHomeViewModel) this.receiver).m14395k(p22);
                return c17296c;
            case 16:
                InterfaceC13368c p23 = (InterfaceC13368c) obj;
                AbstractC16544l.m18094g(p23, "p0");
                ((ComplianceViewModel) this.receiver).m14395k(p23);
                return c17296c;
            case 17:
                return ((AbstractC13422m) this.receiver).mo2035d(obj);
            case 18:
                InterfaceC13636g p24 = (InterfaceC13636g) obj;
                AbstractC16544l.m18094g(p24, "p0");
                ((SnorlaxEditViewModel) this.receiver).m14395k(p24);
                return c17296c;
            case 19:
                AbstractC13431v p25 = (AbstractC13431v) obj;
                AbstractC16544l.m18094g(p25, "p0");
                return C13676h.m15163a((C13676h) this.receiver, p25);
            case 20:
                InterfaceC14052T p26 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p26, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p26);
                return c17296c;
            case 21:
                InterfaceC18393i p27 = (InterfaceC18393i) obj;
                AbstractC16544l.m18094g(p27, "p0");
                ((MessageAudioViewModel) this.receiver).m14395k(p27);
                return c17296c;
            case 22:
                InterfaceC18159W p28 = (InterfaceC18159W) obj;
                AbstractC16544l.m18094g(p28, "p0");
                ((MessagesViewModel) this.receiver).m14395k(p28);
                return c17296c;
            case 23:
                InterfaceC14052T p29 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p29, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p29);
                return c17296c;
            case 24:
                InterfaceC14052T p30 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p30, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p30);
                return c17296c;
            case 25:
                InterfaceC14124i p31 = (InterfaceC14124i) obj;
                AbstractC16544l.m18094g(p31, "p0");
                ((SnorlaxListViewModel) this.receiver).m14395k(p31);
                return c17296c;
            case 26:
                return Boolean.valueOf(((C16484C) this.receiver).m18051d(((C13800b) obj).f43584a));
            case 27:
                return Boolean.valueOf(((C16484C) this.receiver).m18051d(((C13800b) obj).f43584a));
            case 28:
                InterfaceC14052T p32 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p32, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p32);
                return c17296c;
            default:
                InterfaceC19862M p33 = (InterfaceC19862M) obj;
                AbstractC16544l.m18094g(p33, "p0");
                ((InputViewModel) this.receiver).m14395k(p33);
                return c17296c;
        }
    }
}
