package com.ibm.wala.cast.java.test;

import com.ibm.wala.cast.java.client.ECJJavaSourceAnalysisEngine;
import com.ibm.wala.cast.java.client.JavaSourceAnalysisEngine;
import com.ibm.wala.cast.java.ipa.callgraph.JavaSourceAnalysisScope;
import com.ibm.wala.client.AbstractAnalysisEngine;
import com.ibm.wala.core.tests.callGraph.CallGraphTestUtil;
import com.ibm.wala.ipa.callgraph.CallGraphBuilder;
import com.ibm.wala.ipa.callgraph.Entrypoint;
import com.ibm.wala.ipa.callgraph.impl.Util;
import com.ibm.wala.ipa.callgraph.propagation.InstanceKey;
import com.ibm.wala.ipa.cha.IClassHierarchy;
import com.ibm.wala.util.CancelException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import org.junit.jupiter.api.Test;

public class ECJJava15IRTest extends IRTests {

  public ECJJava15IRTest() {
    super(null);
    dump = true;
  }

  @Override
  protected AbstractAnalysisEngine<InstanceKey, CallGraphBuilder<InstanceKey>, ?> getAnalysisEngine(
      final String[] mainClassDescriptors, Collection<String> sources, List<String> libs) {
    JavaSourceAnalysisEngine engine =
        new ECJJavaSourceAnalysisEngine() {
          @Override
          protected Iterable<Entrypoint> makeDefaultEntrypoints(IClassHierarchy cha) {
            return Util.makeMainEntrypoints(
                JavaSourceAnalysisScope.SOURCE, cha, mainClassDescriptors);
          }
        };
    engine.setExclusionsFile(CallGraphTestUtil.REGRESSION_EXCLUSIONS);
    populateScope(engine, sources, libs);
    return engine;
  }

  @Test
  public void testVarargsOverriding()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testEnumSwitch() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testOverridesOnePointFour()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testVarargsCovariant() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testSimpleEnums() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testGenericSuperSink() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testAnonGeneNullarySimple()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testAnonymousGenerics()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testNotSoSimpleEnums() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testVarargs() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testGenericArrays() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testAnnotations() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testCocovariant() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testExplicitBoxingTest()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testWildcards() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testBasicsGenerics() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testCustomGenericsAndFields()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testTypeInferencePrimAndStringOp()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testSimpleEnums2() throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testGenericMemberClasses()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }

  @Test
  public void testMoreOverriddenGenerics()
      throws IllegalArgumentException, CancelException, IOException {
    runTest(
        singlePkgTestSrc("javaonepointfive"),
        rtJar,
        simplePkgTestEntryPoint("javaonepointfive"),
        emptyList,
        true,
        null);
  }
}
