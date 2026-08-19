package p403Qd;

import ao.AbstractC11153a0;
import ao.C11158d;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AbstractC16544l;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import p403Qd.AbstractC6653q0;
import p479Td.AbstractC7343b0;
import p479Td.C7347d0;
import p559Wn.InterfaceC8975g;
import p775h2.AbstractC14376f;

/* JADX INFO: renamed from: Qd.F */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC8975g
public final class C6600F<Data extends AbstractC6653q0> extends AbstractC6659u {
    public static final C6599E Companion = new C6599E();

    /* JADX INFO: renamed from: g */
    public static final KSerializer[] f21309g = {AbstractC11153a0.m12383f("com.openai.feature.conversations.domain.conversation.ToolConversationStatus", EnumC6606L.values()), new C11158d(C7347d0.f23262a, 0), AbstractC7343b0.Companion.serializer(), null};

    /* JADX INFO: renamed from: h */
    public static final PluginGeneratedSerialDescriptor f21310h;

    /* JADX INFO: renamed from: c */
    public final EnumC6606L f21311c;

    /* JADX INFO: renamed from: d */
    public final List f21312d;

    /* JADX INFO: renamed from: e */
    public final AbstractC7343b0 f21313e;

    /* JADX INFO: renamed from: f */
    public final AbstractC6653q0 f21314f;

    static {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.openai.feature.conversations.domain.conversation.ConversationItem.Tool", null, 4);
        pluginGeneratedSerialDescriptor.m18453j("status", false);
        pluginGeneratedSerialDescriptor.m18453j("messages", false);
        pluginGeneratedSerialDescriptor.m18453j("content", false);
        pluginGeneratedSerialDescriptor.m18453j("summary", false);
        f21310h = pluginGeneratedSerialDescriptor;
    }

    public /* synthetic */ C6600F(int i10, EnumC6606L enumC6606L, List list, AbstractC7343b0 abstractC7343b0, AbstractC6653q0 abstractC6653q0) {
        if (15 != (i10 & 15)) {
            AbstractC11153a0.m12389l(i10, 15, f21310h);
            throw null;
        }
        this.f21311c = enumC6606L;
        this.f21312d = list;
        this.f21313e = abstractC7343b0;
        this.f21314f = abstractC6653q0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6600F)) {
            return false;
        }
        C6600F c6600f = (C6600F) obj;
        return this.f21311c == c6600f.f21311c && AbstractC16544l.m18089b(this.f21312d, c6600f.f21312d) && AbstractC16544l.m18089b(this.f21313e, c6600f.f21313e) && AbstractC16544l.m18089b(this.f21314f, c6600f.f21314f);
    }

    public final int hashCode() {
        int iM15858x = AbstractC14376f.m15858x(this.f21312d, this.f21311c.hashCode() * 31, 31);
        AbstractC7343b0 abstractC7343b0 = this.f21313e;
        return this.f21314f.hashCode() + ((iM15858x + (abstractC7343b0 == null ? 0 : abstractC7343b0.hashCode())) * 31);
    }

    public final String toString() {
        return "█";
    }

    public C6600F(EnumC6606L status, ArrayList messages, AbstractC7343b0 abstractC7343b0, AbstractC6653q0 summary) {
        AbstractC16544l.m18094g(status, "status");
        AbstractC16544l.m18094g(messages, "messages");
        AbstractC16544l.m18094g(summary, "summary");
        this.f21311c = status;
        this.f21312d = messages;
        this.f21313e = abstractC7343b0;
        this.f21314f = summary;
    }
}
