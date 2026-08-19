package p870le;

import android.view.KeyEvent;
import com.openai.feature.conversationhistory.dialogs.move.ConversationMoveViewModel;
import com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModel;
import com.openai.feature.conversationhistory.impl.history.HistorySidebarViewModel;
import com.openai.feature.conversations.impl.conversation.ConversationViewModel;
import com.openai.feature.conversations.impl.variants.VariantsInStreamViewModel;
import com.openai.feature.conversations.input.InputViewModel;
import com.openai.feature.messages.audio.MessageAudioViewModel;
import com.openai.feature.messages.image.ImageDetailViewModel;
import com.openai.feature.reporting.ReportingViewModel;
import com.openai.feature.sanction.impl.SanctionViewModel;
import com.openai.feature.whisper.WhisperViewModel;
import ge.InterfaceC14052T;
import kotlin.jvm.internal.AbstractC16541i;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.C16556x;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.BuiltInsResourceLoader;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import kotlin.reflect.jvm.internal.impl.types.model.KotlinTypeMarker;
import mh.InterfaceC17262j;
import mm.C17296C;
import p049Bm.InterfaceC1436k;
import p080D0.C1766B0;
import p080D0.C1831t0;
import p1025te.InterfaceC19862M;
import p1062vd.C20542W;
import p1062vd.InterfaceC20539T;
import p1071w0.AbstractC20734X;
import p1071w0.C20710G0;
import p1071w0.C20724N0;
import p1071w0.C20780v0;
import p1084wg.InterfaceC20948c;
import p1139z0.C21640s0;
import p204I1.C3581L;
import p279L1.VOxZ.sVoFrD;
import p349O0.C6016m0;
import p350O1.C6045C;
import p350O1.C6052a;
import p350O1.C6064m;
import p477Tb.AbstractC7294a;
import p571X9.AbstractC9393x3;
import p964qe.InterfaceC18692e;
import p978r1.AbstractC18857c;
import p978r1.C18856b;
import pf.InterfaceC18393i;
import sg.InterfaceC19558W;
import td.InterfaceC19848k;
import tf.InterfaceC19938w;

/* JADX INFO: renamed from: le.U */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C16863U extends AbstractC16541i implements InterfaceC1436k {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ int f54109Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16863U(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f54109Y = i12;
    }

    @Override // p049Bm.InterfaceC1436k
    public final Object invoke(Object obj) {
        Integer numM21223a;
        int iMo10666e;
        switch (this.f54109Y) {
            case 0:
                InterfaceC14052T p10 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p10, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p10);
                return C17296C.f55119a;
            case 1:
                InterfaceC19862M p11 = (InterfaceC19862M) obj;
                AbstractC16544l.m18094g(p11, "p0");
                ((InputViewModel) this.receiver).m14395k(p11);
                return C17296C.f55119a;
            case 2:
                InterfaceC14052T p12 = (InterfaceC14052T) obj;
                AbstractC16544l.m18094g(p12, "p0");
                ((ConversationViewModel) this.receiver).m14395k(p12);
                return C17296C.f55119a;
            case 3:
                InterfaceC19862M p13 = (InterfaceC19862M) obj;
                AbstractC16544l.m18094g(p13, "p0");
                ((InputViewModel) this.receiver).m14395k(p13);
                return C17296C.f55119a;
            case 4:
                InterfaceC17262j interfaceC17262j = (InterfaceC17262j) obj;
                AbstractC16544l.m18094g(interfaceC17262j, sVoFrD.bjYxuJFp);
                ((WhisperViewModel) this.receiver).m14395k(interfaceC17262j);
                return C17296C.f55119a;
            case 5:
                String p14 = (String) obj;
                AbstractC16544l.m18094g(p14, "p0");
                return ((BuiltInsResourceLoader) this.receiver).loadResource(p14);
            case 6:
                Name p15 = (Name) obj;
                AbstractC16544l.m18094g(p15, "p0");
                return ((DeserializedClassDescriptor) this.receiver).m18380c(p15);
            case 7:
                InterfaceC18393i p16 = (InterfaceC18393i) obj;
                AbstractC16544l.m18094g(p16, "p0");
                ((MessageAudioViewModel) this.receiver).m14395k(p16);
                return C17296C.f55119a;
            case 8:
                InterfaceC18692e p17 = (InterfaceC18692e) obj;
                AbstractC16544l.m18094g(p17, "p0");
                ((VariantsInStreamViewModel) this.receiver).m14395k(p17);
                return C17296C.f55119a;
            case 9:
                KotlinTypeMarker p18 = (KotlinTypeMarker) obj;
                AbstractC16544l.m18094g(p18, "p0");
                return ((KotlinTypePreparator) this.receiver).prepareType(p18);
            case 10:
                InterfaceC19558W p19 = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(p19, "p0");
                ((ReportingViewModel) this.receiver).m14395k(p19);
                return C17296C.f55119a;
            case 11:
                InterfaceC19558W p20 = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(p20, "p0");
                ((ReportingViewModel) this.receiver).m14395k(p20);
                return C17296C.f55119a;
            case 12:
                InterfaceC19558W p21 = (InterfaceC19558W) obj;
                AbstractC16544l.m18094g(p21, "p0");
                ((ReportingViewModel) this.receiver).m14395k(p21);
                return C17296C.f55119a;
            case 13:
                InterfaceC19848k p22 = (InterfaceC19848k) obj;
                AbstractC16544l.m18094g(p22, "p0");
                ((ConversationMoveViewModel) this.receiver).m14395k(p22);
                return C17296C.f55119a;
            case 14:
                InterfaceC19938w p23 = (InterfaceC19938w) obj;
                AbstractC16544l.m18094g(p23, "p0");
                ((ImageDetailViewModel) this.receiver).m14395k(p23);
                return C17296C.f55119a;
            case 15:
                InterfaceC20539T p24 = (InterfaceC20539T) obj;
                AbstractC16544l.m18094g(p24, "p0");
                ((GizmosAndHistoryViewModel) this.receiver).m14395k(p24);
                return C17296C.f55119a;
            case 16:
                C20542W p25 = (C20542W) obj;
                AbstractC16544l.m18094g(p25, "p0");
                ((HistorySidebarViewModel) this.receiver).m14395k(p25);
                return C17296C.f55119a;
            case 17:
                KeyEvent keyEvent = ((C18856b) obj).f60081a;
                C20780v0 c20780v0 = (C20780v0) this.receiver;
                c20780v0.getClass();
                boolean z6 = false;
                C6052a c6052a = ((keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar())) && (numM21223a = c20780v0.f65996i.m21223a(keyEvent)) != null) ? new C6052a(new StringBuilder().appendCodePoint(numM21223a.intValue()).toString(), 1) : null;
                C1766B0 c1766b0 = c20780v0.f65993f;
                boolean z10 = c20780v0.f65991d;
                if (c6052a != null) {
                    if (z10) {
                        c20780v0.m21306a(AbstractC9393x3.m9974d(c6052a));
                        c1766b0.f5041a = null;
                        z6 = true;
                    }
                } else if (AbstractC7294a.m7746c(AbstractC18857c.m20158e(keyEvent), 2) && (iMo10666e = c20780v0.f65997j.mo10666e(keyEvent)) != 0 && (!AbstractC20734X.m21249t(iMo10666e) || z10)) {
                    C16556x c16556x = new C16556x();
                    c16556x.f51285Y = true;
                    C6016m0 c6016m0 = new C6016m0(iMo10666e, c20780v0, c16556x, 5);
                    C20710G0 c20710g0M21294d = c20780v0.f65988a.m21294d();
                    C6045C c6045c = c20780v0.f65990c;
                    C1831t0 c1831t0 = new C1831t0(c6045c, c20780v0.f65994g, c20710g0M21294d, c1766b0);
                    c6016m0.invoke(c1831t0);
                    if (!C3581L.m4266b(c1831t0.f5287f, c6045c.f19683b) || !AbstractC16544l.m18089b(c1831t0.f5288g, c6045c.f19682a)) {
                        c20780v0.f65998k.invoke(C6045C.m6612a(c6045c, c1831t0.f5288g, c1831t0.f5287f, 4));
                    }
                    C20724N0 c20724n0 = c20780v0.f65995h;
                    if (c20724n0 != null) {
                        c20724n0.f65710f = true;
                    }
                    z6 = c16556x.f51285Y;
                }
                return Boolean.valueOf(z6);
            case 18:
                InterfaceC20948c p26 = (InterfaceC20948c) obj;
                AbstractC16544l.m18094g(p26, "p0");
                ((SanctionViewModel) this.receiver).m14395k(p26);
                return C17296C.f55119a;
            default:
                C21640s0.m21986O0((C21640s0) this.receiver, ((C6064m) obj).f19754a);
                return C17296C.f55119a;
        }
    }
}
