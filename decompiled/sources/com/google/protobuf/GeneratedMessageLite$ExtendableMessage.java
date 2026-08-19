package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite$ExtendableMessage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite$ExtendableMessage<MessageType extends GeneratedMessageLite$ExtendableMessage<MessageType, BuilderType>, BuilderType> extends AbstractC12133Z implements InterfaceC12094H0 {
    protected C12110N extensions = C12110N.f36961c;

    private void eagerlyMergeMessageSetExtension(AbstractC12186r abstractC12186r, C12129X c12129x, C12087F c12087f, int i10) {
        parseExtension(abstractC12186r, c12087f, c12129x, (i10 << 3) | 2, i10);
    }

    private void mergeMessageSetExtensionFromBytes(AbstractC12171m abstractC12171m, C12087F c12087f, C12129X c12129x) throws C12181p0 {
        InterfaceC12091G0 interfaceC12091G0 = (InterfaceC12091G0) this.extensions.f36962a.get(c12129x.f36993d);
        InterfaceC12088F0 builder = interfaceC12091G0 != null ? interfaceC12091G0.toBuilder() : null;
        if (builder == null) {
            builder = c12129x.f36992c.newBuilderForType();
        }
        AbstractC12121T abstractC12121T = (AbstractC12121T) builder;
        abstractC12121T.getClass();
        try {
            AbstractC12186r abstractC12186rMo14004s = abstractC12171m.mo14004s();
            abstractC12121T.m13864e(abstractC12186rMo14004s, c12087f);
            abstractC12186rMo14004s.mo14029a(0);
            ensureExtensionsAreMutable().m13853p(c12129x.f36993d, c12129x.m13871b(abstractC12121T.m13861b()));
        } catch (C12181p0 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading " + abstractC12121T.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e11);
        }
    }

    private <MessageType extends InterfaceC12091G0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, AbstractC12186r abstractC12186r, C12087F c12087f) throws C12181p0 {
        int iMo14020F = 0;
        C12168l c12168lMo14036m = null;
        C12129X c12129xM13738a = null;
        while (true) {
            int iMo14019E = abstractC12186r.mo14019E();
            if (iMo14019E == 0) {
                break;
            }
            if (iMo14019E == 16) {
                iMo14020F = abstractC12186r.mo14020F();
                if (iMo14020F != 0) {
                    c12129xM13738a = c12087f.m13738a(iMo14020F, messagetype);
                }
            } else if (iMo14019E == 26) {
                if (iMo14020F == 0 || c12129xM13738a == null) {
                    c12168lMo14036m = abstractC12186r.mo14036m();
                } else {
                    eagerlyMergeMessageSetExtension(abstractC12186r, c12129xM13738a, c12087f, iMo14020F);
                    c12168lMo14036m = null;
                }
            } else if (!abstractC12186r.mo14022H(iMo14019E)) {
                break;
            }
        }
        abstractC12186r.mo14029a(12);
        if (c12168lMo14036m == null || iMo14020F == 0) {
            return;
        }
        if (c12129xM13738a != null) {
            mergeMessageSetExtensionFromBytes(c12168lMo14036m, c12087f, c12129xM13738a);
        } else {
            mergeLengthDelimitedField(iMo14020F, c12168lMo14036m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0008  */
    private boolean parseExtension(AbstractC12186r abstractC12186r, C12087F c12087f, C12129X c12129x, int i10, int i11) {
        boolean z6;
        Object objM13861b;
        InterfaceC12091G0 interfaceC12091G0;
        InterfaceC12088F0 interfaceC12088F0NewBuilderForType = null;
        int i12 = i10 & 7;
        boolean z10 = false;
        if (c12129x == null) {
            z6 = false;
            z10 = true;
        } else {
            C12127W c12127w = c12129x.f36993d;
            EnumC12101J1 enumC12101J1 = c12127w.f36984Z;
            C12110N c12110n = C12110N.f36961c;
            if (i12 == enumC12101J1.f36923Z) {
                z6 = false;
            } else if (c12127w.f36985o0 && enumC12101J1.mo13747a() && i12 == 2) {
                z6 = true;
            } else {
                z6 = false;
                z10 = true;
            }
        }
        if (z10) {
            return parseUnknownField(i10, abstractC12186r);
        }
        ensureExtensionsAreMutable();
        if (z6) {
            int iMo14034k = abstractC12186r.mo14034k(abstractC12186r.mo14046w());
            C12127W c12127w2 = c12129x.f36993d;
            if (c12127w2.f36984Z != EnumC12101J1.f36920t0) {
                while (abstractC12186r.mo14030e() > 0) {
                    EnumC12101J1 enumC12101J2 = c12127w2.f36984Z;
                    C12110N c12110n2 = C12110N.f36961c;
                    this.extensions.m13843a(c12127w2, AbstractC12153g.m13963Y(abstractC12186r, enumC12101J2, 1));
                }
            } else if (abstractC12186r.mo14030e() > 0) {
                abstractC12186r.mo14038o();
                throw null;
            }
            abstractC12186r.mo14033j(iMo14034k);
        } else {
            int iOrdinal = c12129x.f36993d.f36984Z.f36922Y.ordinal();
            C12127W c12127w3 = c12129x.f36993d;
            if (iOrdinal == 7) {
                abstractC12186r.mo14038o();
                c12127w3.getClass();
                throw null;
            }
            if (iOrdinal != 8) {
                EnumC12101J1 enumC12101J3 = c12127w3.f36984Z;
                C12110N c12110n3 = C12110N.f36961c;
                objM13861b = AbstractC12153g.m13963Y(abstractC12186r, enumC12101J3, 1);
            } else {
                if (!c12127w3.f36985o0 && (interfaceC12091G0 = (InterfaceC12091G0) this.extensions.f36962a.get(c12127w3)) != null) {
                    interfaceC12088F0NewBuilderForType = interfaceC12091G0.toBuilder();
                }
                if (interfaceC12088F0NewBuilderForType == null) {
                    interfaceC12088F0NewBuilderForType = c12129x.f36992c.newBuilderForType();
                }
                if (c12127w3.f36984Z == EnumC12101J1.f36917q0) {
                    abstractC12186r.mo14042s(c12127w3.f36983Y, interfaceC12088F0NewBuilderForType, c12087f);
                } else {
                    abstractC12186r.mo14045v(interfaceC12088F0NewBuilderForType, c12087f);
                }
                objM13861b = ((AbstractC12121T) interfaceC12088F0NewBuilderForType).m13861b();
            }
            if (c12127w3.f36985o0) {
                this.extensions.m13843a(c12127w3, c12129x.m13871b(objM13861b));
            } else {
                this.extensions.m13853p(c12127w3, c12129x.m13871b(objM13861b));
            }
        }
        return true;
    }

    private void verifyExtensionContainingType(C12129X c12129x) {
        if (c12129x.f36990a != getDefaultInstanceForType()) {
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }
    }

    public C12110N ensureExtensionsAreMutable() {
        C12110N c12110n = this.extensions;
        if (c12110n.f36963b) {
            this.extensions = c12110n.clone();
        }
        return this.extensions;
    }

    public boolean extensionsAreInitialized() {
        return this.extensions.m13848j();
    }

    public int extensionsSerializedSize() {
        return this.extensions.m13846h();
    }

    public int extensionsSerializedSizeAsMessageSet() {
        return this.extensions.m13845f();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
    public final <Type> Type getExtension(AbstractC12078C abstractC12078C) {
        C12129X c12129xAccess$000 = AbstractC12133Z.access$000(abstractC12078C);
        verifyExtensionContainingType(c12129xAccess$000);
        C12110N c12110n = this.extensions;
        Type type = (Type) c12110n.f36962a.get(c12129xAccess$000.f36993d);
        if (type == null) {
            return (Type) c12129xAccess$000.f36991b;
        }
        C12127W c12127w = c12129xAccess$000.f36993d;
        if (!c12127w.f36985o0) {
            return (Type) c12129xAccess$000.m13870a(type);
        }
        if (c12127w.f36984Z.f36922Y != EnumC12104K1.ENUM) {
            return type;
        }
        ?? r6 = (Type) new ArrayList();
        Iterator it = ((List) type).iterator();
        while (it.hasNext()) {
            r6.add(c12129xAccess$000.m13870a(it.next()));
        }
        return r6;
    }

    public final <Type> int getExtensionCount(AbstractC12078C abstractC12078C) {
        C12129X c12129xAccess$000 = AbstractC12133Z.access$000(abstractC12078C);
        verifyExtensionContainingType(c12129xAccess$000);
        C12110N c12110n = this.extensions;
        C12127W c12127w = c12129xAccess$000.f36993d;
        c12110n.getClass();
        if (!c12127w.f36985o0) {
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
        Object obj = c12110n.f36962a.get(c12127w);
        if (obj == null) {
            return 0;
        }
        return ((List) obj).size();
    }

    public final <Type> boolean hasExtension(AbstractC12078C abstractC12078C) {
        C12129X c12129xAccess$000 = AbstractC12133Z.access$000(abstractC12078C);
        verifyExtensionContainingType(c12129xAccess$000);
        C12110N c12110n = this.extensions;
        C12127W c12127w = c12129xAccess$000.f36993d;
        c12110n.getClass();
        if (c12127w.f36985o0) {
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }
        return c12110n.f36962a.get(c12127w) != null;
    }

    public final void mergeExtensionFields(MessageType messagetype) {
        C12110N c12110n = this.extensions;
        if (c12110n.f36963b) {
            this.extensions = c12110n.clone();
        }
        this.extensions.m13851n(messagetype.extensions);
    }

    public C12125V newExtensionWriter() {
        return new C12125V(this);
    }

    public C12125V newMessageSetExtensionWriter() {
        return new C12125V(this);
    }

    public <MessageType extends InterfaceC12091G0> boolean parseUnknownField(MessageType messagetype, AbstractC12186r abstractC12186r, C12087F c12087f, int i10) {
        int i11 = i10 >>> 3;
        return parseExtension(abstractC12186r, c12087f, c12087f.m13738a(i11, messagetype), i10, i11);
    }

    public <MessageType extends InterfaceC12091G0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, AbstractC12186r abstractC12186r, C12087F c12087f, int i10) throws C12181p0 {
        if (i10 != 11) {
            return (i10 & 7) == 2 ? parseUnknownField(messagetype, abstractC12186r, c12087f, i10) : abstractC12186r.mo14022H(i10);
        }
        mergeMessageSetExtensionFromCodedStream(messagetype, abstractC12186r, c12087f);
        return true;
    }

    public final <Type> Type getExtension(AbstractC12078C abstractC12078C, int i10) {
        C12129X c12129xAccess$000 = AbstractC12133Z.access$000(abstractC12078C);
        verifyExtensionContainingType(c12129xAccess$000);
        C12110N c12110n = this.extensions;
        C12127W c12127w = c12129xAccess$000.f36993d;
        c12110n.getClass();
        if (c12127w.f36985o0) {
            Object obj = c12110n.f36962a.get(c12127w);
            if (obj != null) {
                return (Type) c12129xAccess$000.m13870a(((List) obj).get(i10));
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }
}
