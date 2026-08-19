package com.openai.feature.conversations.impl.conversation;

import ge.C14076g;
import ge.C14111x0;
import ge.EnumC14040M0;
import id.C14962a;
import id.C14968g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC16544l;
import kotlin.jvm.internal.AbstractC16546n;
import livekit.LivekitInternal$NodeStats;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1436k;
import p049Bm.InterfaceC1439n;
import p1025te.C19864O;
import p1025te.C19874e;
import p1025te.C19876g;
import p1025te.InterfaceC19878i;
import p1042uh.C20263a0;
import p1155zi.InterfaceC21915G;
import p269Kh.C4688o;
import p571X9.AbstractC9233X;
import p858ko.C16482A;
import p909nm.AbstractC17682p;
import p972qm.InterfaceC18770c;
import p990rg.C18982i;
import p990rg.C18983j;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$send$1", m20656f = "ConversationViewModel.kt", m20657l = {1195}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class ConversationViewModelImpl$send$1 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public int f37787Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ ConversationViewModelImpl f37788Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ String f37789o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ EnumC14040M0 f37790p0;

    /* JADX INFO: renamed from: com.openai.feature.conversations.impl.conversation.ConversationViewModelImpl$send$1$1 */
    @Metadata(m18066d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m18067d2 = {"Lge/x0;", "invoke", "(Lge/x0;)Lge/x0;", "<anonymous>"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C123081 extends AbstractC16546n implements InterfaceC1436k {

        /* JADX INFO: renamed from: Y */
        public static final C123081 f37791Y = new C123081();

        public C123081() {
            super(1);
        }

        @Override // p049Bm.InterfaceC1436k
        public final Object invoke(Object obj) {
            C14111x0 setState = (C14111x0) obj;
            AbstractC16544l.m18094g(setState, "$this$setState");
            return C14111x0.m15491e(setState, null, null, null, null, null, null, null, null, null, null, false, false, false, null, false, false, false, null, null, C14076g.m15485a(setState.f44437y, null, null, false, true, 15), null, false, false, null, false, null, null, false, null, null, null, false, false, null, null, false, 2130706431, 8388607);
        }
    }

    @Metadata(m18068k = 3, m18069mv = {1, 9, 0}, m18071xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    public /* synthetic */ class WhenMappings {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37792a;

        static {
            int[] iArr = new int[EnumC14040M0.values().length];
            try {
                EnumC14040M0 enumC14040M0 = EnumC14040M0.f44139Y;
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f37792a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConversationViewModelImpl$send$1(ConversationViewModelImpl conversationViewModelImpl, String str, EnumC14040M0 enumC14040M0, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37788Z = conversationViewModelImpl;
        this.f37789o0 = str;
        this.f37790p0 = enumC14040M0;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new ConversationViewModelImpl$send$1(this.f37788Z, this.f37789o0, this.f37790p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((ConversationViewModelImpl$send$1) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    @Override // sm.AbstractC19685a
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        C18983j c18983j;
        List list;
        EnumC19250a enumC19250a = EnumC19250a.f61036Y;
        int i10 = this.f37787Y;
        ConversationViewModelImpl conversationViewModelImpl = this.f37788Z;
        if (i10 == 0) {
            AbstractC9233X.m9807c(obj);
            C14111x0 c14111x0 = (C14111x0) conversationViewModelImpl.f40343c.getValue();
            C4688o c4688oM21453a = c14111x0.f44375F;
            if (c4688oM21453a == null) {
                c4688oM21453a = c14111x0.f44406f.m21453a();
            }
            conversationViewModelImpl.m14397m(C123081.f37791Y);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = c14111x0.f44405e0.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                InterfaceC19878i interfaceC19878i = ((C19874e) ((Map.Entry) it.next()).getValue()).f63015c;
                C19876g c19876g = interfaceC19878i instanceof C19876g ? (C19876g) interfaceC19878i : null;
                InterfaceC21915G interfaceC21915G = c19876g != null ? c19876g.f63017a : null;
                if (interfaceC21915G != null) {
                    arrayList2.add(interfaceC21915G);
                }
            }
            C14968g c14968g = conversationViewModelImpl.f37597v;
            if (c14968g.f46619Y.f58773a.f58783b) {
                c14968g.mo15971c(C14962a.f46601Z);
            }
            String str = c4688oM21453a.f15253b;
            C20263a0 c20263a0 = c14111x0.f44407f0;
            if (c20263a0 == null) {
                c20263a0 = c14111x0.f44411h0;
            }
            C20263a0 c20263a1 = c20263a0;
            if (WhenMappings.f37792a[this.f37790p0.ordinal()] != 1 || (c18983j = c14111x0.f44418l) == null || (list = c18983j.f60549a) == null) {
                arrayList = null;
            } else {
                List list2 = list;
                ArrayList arrayList3 = new ArrayList(AbstractC17682p.m19389r(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(((C18982i) it2.next()).f60545d);
                }
                arrayList = arrayList3;
            }
            boolean z6 = c14111x0.f44416k.f62955b;
            this.f37787Y = 1;
            if (conversationViewModelImpl.f37588m.m15986o(this.f37789o0, str, arrayList2, c20263a1, c14111x0.f44380K, arrayList, z6, this) == enumC19250a) {
                return enumC19250a;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC9233X.m9807c(obj);
        }
        C19864O c19864o = conversationViewModelImpl.f37594s;
        c19864o.getClass();
        c19864o.m20781a(new C16482A(c19864o, 28));
        return C17296C.f55119a;
    }
}
