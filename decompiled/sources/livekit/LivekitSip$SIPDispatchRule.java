package livekit;

import com.google.protobuf.AbstractC12133Z;
import com.google.protobuf.AbstractC12171m;
import com.google.protobuf.AbstractC12186r;
import com.google.protobuf.C12087F;
import com.google.protobuf.C12123U;
import com.google.protobuf.EnumC12131Y;
import com.google.protobuf.InterfaceC12094H0;
import com.google.protobuf.InterfaceC12124U0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import p793ho.C14763i5;
import p793ho.C14777k5;
import p793ho.C14784l5;
import p793ho.C14791m5;
import p793ho.EnumC14770j5;

/* JADX INFO: loaded from: classes2.dex */
public final class LivekitSip$SIPDispatchRule extends AbstractC12133Z implements InterfaceC12094H0 {
    private static final LivekitSip$SIPDispatchRule DEFAULT_INSTANCE;
    public static final int DISPATCH_RULE_CALLEE_FIELD_NUMBER = 3;
    public static final int DISPATCH_RULE_DIRECT_FIELD_NUMBER = 1;
    public static final int DISPATCH_RULE_INDIVIDUAL_FIELD_NUMBER = 2;
    private static volatile InterfaceC12124U0 PARSER;
    private int ruleCase_ = 0;
    private Object rule_;

    static {
        LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule = new LivekitSip$SIPDispatchRule();
        DEFAULT_INSTANCE = livekitSip$SIPDispatchRule;
        AbstractC12133Z.registerDefaultInstance(LivekitSip$SIPDispatchRule.class, livekitSip$SIPDispatchRule);
    }

    private LivekitSip$SIPDispatchRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchRuleCallee() {
        if (this.ruleCase_ == 3) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchRuleDirect() {
        if (this.ruleCase_ == 1) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDispatchRuleIndividual() {
        if (this.ruleCase_ == 2) {
            this.ruleCase_ = 0;
            this.rule_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRule() {
        this.ruleCase_ = 0;
        this.rule_ = null;
    }

    public static LivekitSip$SIPDispatchRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDispatchRuleCallee(LivekitSip$SIPDispatchRuleCallee livekitSip$SIPDispatchRuleCallee) {
        livekitSip$SIPDispatchRuleCallee.getClass();
        if (this.ruleCase_ != 3 || this.rule_ == LivekitSip$SIPDispatchRuleCallee.getDefaultInstance()) {
            this.rule_ = livekitSip$SIPDispatchRuleCallee;
        } else {
            C14777k5 c14777k5NewBuilder = LivekitSip$SIPDispatchRuleCallee.newBuilder((LivekitSip$SIPDispatchRuleCallee) this.rule_);
            c14777k5NewBuilder.m13865f(livekitSip$SIPDispatchRuleCallee);
            this.rule_ = c14777k5NewBuilder.m13862c();
        }
        this.ruleCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDispatchRuleDirect(LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect) {
        livekitSip$SIPDispatchRuleDirect.getClass();
        if (this.ruleCase_ != 1 || this.rule_ == LivekitSip$SIPDispatchRuleDirect.getDefaultInstance()) {
            this.rule_ = livekitSip$SIPDispatchRuleDirect;
        } else {
            C14784l5 c14784l5NewBuilder = LivekitSip$SIPDispatchRuleDirect.newBuilder((LivekitSip$SIPDispatchRuleDirect) this.rule_);
            c14784l5NewBuilder.m13865f(livekitSip$SIPDispatchRuleDirect);
            this.rule_ = c14784l5NewBuilder.m13862c();
        }
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDispatchRuleIndividual(LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual) {
        livekitSip$SIPDispatchRuleIndividual.getClass();
        if (this.ruleCase_ != 2 || this.rule_ == LivekitSip$SIPDispatchRuleIndividual.getDefaultInstance()) {
            this.rule_ = livekitSip$SIPDispatchRuleIndividual;
        } else {
            C14791m5 c14791m5NewBuilder = LivekitSip$SIPDispatchRuleIndividual.newBuilder((LivekitSip$SIPDispatchRuleIndividual) this.rule_);
            c14791m5NewBuilder.m13865f(livekitSip$SIPDispatchRuleIndividual);
            this.rule_ = c14791m5NewBuilder.m13862c();
        }
        this.ruleCase_ = 2;
    }

    public static C14763i5 newBuilder() {
        return (C14763i5) DEFAULT_INSTANCE.createBuilder();
    }

    public static LivekitSip$SIPDispatchRule parseDelimitedFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(ByteBuffer byteBuffer) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static InterfaceC12124U0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchRuleCallee(LivekitSip$SIPDispatchRuleCallee livekitSip$SIPDispatchRuleCallee) {
        livekitSip$SIPDispatchRuleCallee.getClass();
        this.rule_ = livekitSip$SIPDispatchRuleCallee;
        this.ruleCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchRuleDirect(LivekitSip$SIPDispatchRuleDirect livekitSip$SIPDispatchRuleDirect) {
        livekitSip$SIPDispatchRuleDirect.getClass();
        this.rule_ = livekitSip$SIPDispatchRuleDirect;
        this.ruleCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDispatchRuleIndividual(LivekitSip$SIPDispatchRuleIndividual livekitSip$SIPDispatchRuleIndividual) {
        livekitSip$SIPDispatchRuleIndividual.getClass();
        this.rule_ = livekitSip$SIPDispatchRuleIndividual;
        this.ruleCase_ = 2;
    }

    @Override // com.google.protobuf.AbstractC12133Z
    public final Object dynamicMethod(EnumC12131Y enumC12131Y, Object obj, Object obj2) {
        switch (enumC12131Y.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return AbstractC12133Z.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"rule_", "ruleCase_", LivekitSip$SIPDispatchRuleDirect.class, LivekitSip$SIPDispatchRuleIndividual.class, LivekitSip$SIPDispatchRuleCallee.class});
            case 3:
                return new LivekitSip$SIPDispatchRule();
            case 4:
                return new C14763i5(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC12124U0 c12123u = PARSER;
                if (c12123u == null) {
                    synchronized (LivekitSip$SIPDispatchRule.class) {
                        try {
                            c12123u = PARSER;
                            if (c12123u == null) {
                                c12123u = new C12123U();
                                PARSER = c12123u;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return c12123u;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public LivekitSip$SIPDispatchRuleCallee getDispatchRuleCallee() {
        return this.ruleCase_ == 3 ? (LivekitSip$SIPDispatchRuleCallee) this.rule_ : LivekitSip$SIPDispatchRuleCallee.getDefaultInstance();
    }

    public LivekitSip$SIPDispatchRuleDirect getDispatchRuleDirect() {
        return this.ruleCase_ == 1 ? (LivekitSip$SIPDispatchRuleDirect) this.rule_ : LivekitSip$SIPDispatchRuleDirect.getDefaultInstance();
    }

    public LivekitSip$SIPDispatchRuleIndividual getDispatchRuleIndividual() {
        return this.ruleCase_ == 2 ? (LivekitSip$SIPDispatchRuleIndividual) this.rule_ : LivekitSip$SIPDispatchRuleIndividual.getDefaultInstance();
    }

    public EnumC14770j5 getRuleCase() {
        int i10 = this.ruleCase_;
        if (i10 == 0) {
            return EnumC14770j5.f46212p0;
        }
        if (i10 == 1) {
            return EnumC14770j5.f46209Y;
        }
        if (i10 == 2) {
            return EnumC14770j5.f46210Z;
        }
        if (i10 != 3) {
            return null;
        }
        return EnumC14770j5.f46211o0;
    }

    public boolean hasDispatchRuleCallee() {
        return this.ruleCase_ == 3;
    }

    public boolean hasDispatchRuleDirect() {
        return this.ruleCase_ == 1;
    }

    public boolean hasDispatchRuleIndividual() {
        return this.ruleCase_ == 2;
    }

    public static C14763i5 newBuilder(LivekitSip$SIPDispatchRule livekitSip$SIPDispatchRule) {
        return (C14763i5) DEFAULT_INSTANCE.createBuilder(livekitSip$SIPDispatchRule);
    }

    public static LivekitSip$SIPDispatchRule parseDelimitedFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(ByteBuffer byteBuffer, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, byteBuffer, c12087f);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC12171m abstractC12171m) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC12171m abstractC12171m, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12171m, c12087f);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(byte[] bArr) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(byte[] bArr, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, bArr, c12087f);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(InputStream inputStream) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(InputStream inputStream, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, inputStream, c12087f);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC12186r abstractC12186r) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r);
    }

    public static LivekitSip$SIPDispatchRule parseFrom(AbstractC12186r abstractC12186r, C12087F c12087f) {
        return (LivekitSip$SIPDispatchRule) AbstractC12133Z.parseFrom(DEFAULT_INSTANCE, abstractC12186r, c12087f);
    }
}
