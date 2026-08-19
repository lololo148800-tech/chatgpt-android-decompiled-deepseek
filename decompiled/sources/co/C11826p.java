package co;

import bo.AbstractC11516d;
import java.nio.charset.CharacterCodingException;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import p076Cm.InterfaceC1723a;
import p372P3.AbstractC6327i;

/* JADX INFO: renamed from: co.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C11826p implements Iterator, InterfaceC1723a {

    /* JADX INFO: renamed from: Y */
    public final AbstractC11516d f35835Y;

    /* JADX INFO: renamed from: Z */
    public final C11802C f35836Z;

    /* JADX INFO: renamed from: o0 */
    public final KSerializer f35837o0;

    /* JADX INFO: renamed from: p0 */
    public boolean f35838p0;

    /* JADX INFO: renamed from: q0 */
    public boolean f35839q0;

    public C11826p(AbstractC11516d json, C11802C c11802c, KSerializer kSerializer) {
        AbstractC16544l.m18094g(json, "json");
        this.f35835Y = json;
        this.f35836Z = c11802c;
        this.f35837o0 = kSerializer;
        this.f35838p0 = true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f35839q0) {
            return false;
        }
        C11802C c11802c = this.f35836Z;
        if (c11802c.mo6939y() != 9) {
            if (c11802c.mo6939y() != 10 || this.f35839q0) {
                return true;
            }
            c11802c.m6934s((byte) 9, true);
            throw null;
        }
        this.f35839q0 = true;
        c11802c.m6923g((byte) 9);
        if (c11802c.mo6939y() != 10) {
            if (c11802c.mo6939y() == 8) {
                AbstractC6327i.m6908r(c11802c, "There is a start of the new array after the one parsed to sequence. ARRAY_WRAPPED mode doesn't merge consecutive arrays.\nIf you need to parse a stream of arrays, please use WHITESPACE_SEPARATED mode instead.", 0, null, 6);
                throw null;
            }
            c11802c.m6932p();
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() throws CharacterCodingException {
        boolean z6 = this.f35838p0;
        C11802C c11802c = this.f35836Z;
        if (z6) {
            this.f35838p0 = false;
        } else {
            c11802c.mo6924h(',');
        }
        EnumC11810K enumC11810K = EnumC11810K.OBJ;
        KSerializer kSerializer = this.f35837o0;
        return new C11804E(this.f35835Y, enumC11810K, c11802c, kSerializer.getDescriptor(), null).mo5482p(kSerializer);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
