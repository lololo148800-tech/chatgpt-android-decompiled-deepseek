package p860l0;

import mm.C17296C;
import p049Bm.InterfaceC1439n;
import p1014t1.C19748y;
import p972qm.InterfaceC18770c;
import p972qm.InterfaceC18776i;
import sm.AbstractC19692h;

/* JADX INFO: renamed from: l0.D0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16667D0 extends AbstractC19692h implements InterfaceC1439n {

    /* JADX INFO: renamed from: Z */
    public int f53376Z;

    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ Object f53377o0;

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ InterfaceC18776i f53378p0;

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ AbstractC19692h f53379q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C16667D0(InterfaceC18776i interfaceC18776i, InterfaceC1439n interfaceC1439n, InterfaceC18770c interfaceC18770c) {
        super(2, interfaceC18770c);
        this.f53378p0 = interfaceC18776i;
        this.f53379q0 = (AbstractC19692h) interfaceC1439n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [Bm.n, sm.h] */
    @Override // sm.AbstractC19685a
    public final InterfaceC18770c create(Object obj, InterfaceC18770c interfaceC18770c) {
        C16667D0 c16667d0 = new C16667D0(this.f53378p0, this.f53379q0, interfaceC18770c);
        c16667d0.f53377o0 = obj;
        return c16667d0;
    }

    @Override // p049Bm.InterfaceC1439n
    public final Object invoke(Object obj, Object obj2) {
        return ((C16667D0) create((C19748y) obj, (InterfaceC18770c) obj2)).invokeSuspend(C17296C.f55119a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0041 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, t1.y] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, t1.y] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [Bm.n, sm.h] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v8 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0057 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006c -> B:12:0x0028). Please report as a decompilation issue!!! */
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
            int r1 = r8.f53376Z
            qm.i r2 = r8.f53378p0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L34
            if (r1 == r5) goto L2c
            if (r1 == r4) goto L21
            if (r1 != r3) goto L19
            java.lang.Object r1 = r8.f53377o0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r9)
            goto L28
        L19:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L21:
            java.lang.Object r1 = r8.f53377o0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
        L28:
            r9 = r1
            goto L3b
        L2a:
            r9 = move-exception
            goto L5e
        L2c:
            java.lang.Object r1 = r8.f53377o0
            t1.y r1 = (p1014t1.C19748y) r1
            p571X9.AbstractC9233X.m9807c(r9)     // Catch: java.util.concurrent.CancellationException -> L2a
            goto L4f
        L34:
            p571X9.AbstractC9233X.m9807c(r9)
            java.lang.Object r9 = r8.f53377o0
            t1.y r9 = (p1014t1.C19748y) r9
        L3b:
            boolean r1 = p025An.AbstractC0575H.m1197z(r2)
            if (r1 == 0) goto L70
            sm.h r1 = r8.f53379q0     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f53377o0 = r9     // Catch: java.util.concurrent.CancellationException -> L5a
            r8.f53376Z = r5     // Catch: java.util.concurrent.CancellationException -> L5a
            java.lang.Object r1 = r1.invoke(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5a
            if (r1 != r0) goto L4e
            return r0
        L4e:
            r1 = r9
        L4f:
            r8.f53377o0 = r1     // Catch: java.util.concurrent.CancellationException -> L2a
            r8.f53376Z = r4     // Catch: java.util.concurrent.CancellationException -> L2a
            java.lang.Object r9 = p544W9.AbstractC8717t4.m9427a(r1, r8)     // Catch: java.util.concurrent.CancellationException -> L2a
            if (r9 != r0) goto L28
            return r0
        L5a:
            r1 = move-exception
            r7 = r1
            r1 = r9
            r9 = r7
        L5e:
            boolean r6 = p025An.AbstractC0575H.m1197z(r2)
            if (r6 == 0) goto L6f
            r8.f53377o0 = r1
            r8.f53376Z = r3
            java.lang.Object r9 = p544W9.AbstractC8717t4.m9427a(r1, r8)
            if (r9 != r0) goto L28
            return r0
        L6f:
            throw r9
        L70:
            mm.C r9 = mm.C17296C.f55119a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p860l0.C16667D0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
