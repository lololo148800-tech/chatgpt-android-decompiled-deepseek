package p273Kl;

import kotlin.jvm.internal.AbstractC16546n;
import livekit.org.webrtc.PeerConnection;
import livekit.org.webrtc.PeerConnectionFactory;
import p049Bm.InterfaceC1426a;

/* JADX INFO: renamed from: Kl.o */
/* JADX INFO: loaded from: classes3.dex */
public final class C4788o extends AbstractC16546n implements InterfaceC1426a {

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ PeerConnectionFactory f15614Y;

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ PeerConnection.RTCConfiguration f15615Z;

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ Object f15616o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4788o(PeerConnectionFactory peerConnectionFactory, PeerConnection.RTCConfiguration rTCConfiguration, PeerConnection.Observer observer) {
        super(0);
        this.f15614Y = peerConnectionFactory;
        this.f15615Z = rTCConfiguration;
        this.f15616o0 = observer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, livekit.org.webrtc.PeerConnection$Observer] */
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
    @Override // p049Bm.InterfaceC1426a
    public final Object invoke() {
        PeerConnection peerConnectionCreatePeerConnection = this.f15614Y.createPeerConnection(this.f15615Z, (PeerConnection.Observer) this.f15616o0);
        if (peerConnectionCreatePeerConnection != null) {
            return peerConnectionCreatePeerConnection;
        }
        throw new IllegalStateException("peer connection creation failed?");
    }
}
