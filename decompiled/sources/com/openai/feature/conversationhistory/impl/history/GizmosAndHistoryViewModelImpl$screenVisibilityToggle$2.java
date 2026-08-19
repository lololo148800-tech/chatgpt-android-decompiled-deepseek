package com.openai.feature.conversationhistory.impl.history;

import java.util.Iterator;
import kotlin.Metadata;
import mm.C17296C;
import p025An.InterfaceC0571F;
import p049Bm.InterfaceC1439n;
import p1062vd.C20549b0;
import p571X9.AbstractC9233X;
import p972qm.InterfaceC18770c;
import p996rm.EnumC19250a;
import sm.AbstractC19694j;
import sm.InterfaceC19689e;

/* JADX INFO: loaded from: classes3.dex */
@InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {274, 281}, m20658m = "invokeSuspend")
@Metadata(m18066d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, m18067d2 = {"LAn/F;", "Lmm/C;", "<anonymous>", "(LAn/F;)V"}, m18068k = 3, m18069mv = {1, 9, 0})
final class GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2 extends AbstractC19694j implements InterfaceC1439n {

    /* JADX INFO: renamed from: Y */
    public GizmosAndHistoryViewModelImpl f37480Y;

    /* JADX INFO: renamed from: Z */
    public Iterator f37481Z;

    /* JADX INFO: renamed from: o0 */
    public int f37482o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ GizmosAndHistoryViewModelImpl f37483p0;

    /* JADX INFO: renamed from: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2$1 */
    @InterfaceC19689e(m20655c = "com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2$1", m20656f = "GizmosAndHistoryViewModel.kt", m20657l = {}, m20658m = "invokeSuspend")
    @Metadata(m18066d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m18067d2 = {"Lvd/b0;", "it", "", "<anonymous>", "(Lvd/b0;)Z"}, m18068k = 3, m18069mv = {1, 9, 0})
    final class C122501 extends AbstractC19694j implements InterfaceC1439n {

        /* JADX INFO: renamed from: Y */
        public /* synthetic */ Object f37484Y;

        @Override // sm.AbstractC19685a
        public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
            C122501 c122501 = new C122501(2, interfaceC18770c);
            c122501.f37484Y = obj;
            return c122501;
        }

        @Override // p049Bm.InterfaceC1439n
        public final Object invoke(Object obj, Object obj2) {
            return ((C122501) create((C20549b0) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
        }

        @Override // sm.AbstractC19685a
        public final Object invokeSuspend(Object obj) {
            EnumC19250a enumC19250a = EnumC19250a.f61036Y;
            AbstractC9233X.m9807c(obj);
            return Boolean.valueOf(!((C20549b0) this.f37484Y).f65232x);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2(GizmosAndHistoryViewModelImpl gizmosAndHistoryViewModelImpl, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f37483p0 = gizmosAndHistoryViewModelImpl;
    }

    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        return new GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2(this.f37483p0, interfaceC18770c);
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2) create((InterfaceC0571F) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0088  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:? A[LOOP:0: B:26:0x0082->B:41:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a2 -> B:33:0x00a5). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sm.AbstractC19685a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            rm.a r0 = p996rm.EnumC19250a.f61036Y
            int r1 = r8.f37482o0
            r2 = 0
            com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl r3 = r8.f37483p0
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L24
            if (r1 == r4) goto L20
            if (r1 != r5) goto L18
            java.util.Iterator r1 = r8.f37481Z
            com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl r3 = r8.f37480Y
            p571X9.AbstractC9233X.m9807c(r9)
            goto La5
        L18:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L20:
            p571X9.AbstractC9233X.m9807c(r9)
            goto L37
        L24:
            p571X9.AbstractC9233X.m9807c(r9)
            Dn.Q0 r9 = r3.f40343c
            com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2$1 r1 = new com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2$1
            r1.<init>(r5, r2)
            r8.f37482o0 = r4
            java.lang.Object r9 = p103Dn.AbstractC2124C.m3220s(r9, r1, r8)
            if (r9 != r0) goto L37
            return r0
        L37:
            vd.b0 r9 = (p1062vd.C20549b0) r9
            java.util.ArrayList r9 = r9.f65208E
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r9 = r9.iterator()
        L44:
            boolean r4 = r9.hasNext()
            if (r4 == 0) goto L56
            java.lang.Object r4 = r9.next()
            boolean r6 = r4 instanceof p1062vd.C20541V
            if (r6 == 0) goto L44
            r1.add(r4)
            goto L44
        L56:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L76
            java.lang.Object r4 = r1.next()
            r6 = r4
            vd.V r6 = (p1062vd.C20541V) r6
            Qd.i r6 = r6.f65169a
            boolean r6 = r6.f21400v
            if (r6 != 0) goto L5f
            r9.add(r4)
            goto L5f
        L76:
            r1 = 5
            java.util.List r9 = p909nm.AbstractC17680n.m19373w0(r9, r1)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
            r1 = r9
        L82:
            boolean r9 = r1.hasNext()
            if (r9 == 0) goto Lb8
            java.lang.Object r9 = r1.next()
            vd.V r9 = (p1062vd.C20541V) r9
            Qd.i r4 = r9.f65169a
            java.lang.String r4 = r4.f21380b
            if (r4 == 0) goto L82
            oe.B r6 = r3.f37370j
            r8.f37480Y = r3
            r8.f37481Z = r1
            r8.f37482o0 = r5
            java.lang.String r9 = r9.f65171c
            java.lang.Object r9 = r6.m19699d(r4, r9, r8)
            if (r9 != r0) goto La5
            return r0
        La5:
            zi.Q1 r9 = (p1155zi.AbstractC21955Q1) r9
            boolean r4 = r9 instanceof p1155zi.AbstractC21933K1
            if (r4 == 0) goto L82
            zi.K1 r9 = (p1155zi.AbstractC21933K1) r9
            Hh.e r4 = r3.f37376p
            java.lang.Throwable r9 = r9.f69485a
            r6 = 4
            java.lang.String r7 = "Failed to generate title"
            p523V9.AbstractC8160o6.m8731f(r4, r7, r9, r2, r6)
            goto L82
        Lb8:
            mm.C r9 = mm.C17296C.f55119a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.openai.feature.conversationhistory.impl.history.GizmosAndHistoryViewModelImpl$screenVisibilityToggle$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
