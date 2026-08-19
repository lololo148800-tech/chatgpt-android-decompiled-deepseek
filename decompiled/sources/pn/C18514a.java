package pn;

import kotlin.reflect.jvm.internal.impl.types.AbstractTypeChecker;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.model.RigidTypeMarker;
import kotlin.reflect.jvm.internal.impl.types.model.TypeSystemContext;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: pn.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C18514a implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final TypeCheckerState f58998Y;

    /* JADX INFO: renamed from: Z */
    public final TypeSystemContext f58999Z;

    /* JADX INFO: renamed from: o0 */
    public final RigidTypeMarker f59000o0;

    /* JADX INFO: renamed from: p0 */
    public final RigidTypeMarker f59001p0;

    public C18514a(TypeCheckerState typeCheckerState, TypeSystemContext typeSystemContext, RigidTypeMarker rigidTypeMarker, RigidTypeMarker rigidTypeMarker2) {
        this.f58998Y = typeCheckerState;
        this.f58999Z = typeSystemContext;
        this.f59000o0 = rigidTypeMarker;
        this.f59001p0 = rigidTypeMarker2;
    }

    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        return Boolean.valueOf(AbstractTypeChecker.INSTANCE.isSubtypeForSameConstructor(this.f58998Y, this.f58999Z.asArgumentList(this.f59000o0), this.f59001p0));
    }
}
