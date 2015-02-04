package io.oasp.module.beanmapping.common.impl;

import io.oasp.module.beanmapping.common.base.AbstractBeanMapper;

import javax.inject.Inject;

import org.dozer.Mapper;

/**
 * TODO This is the implementation of {@link io.oasp.module.beanmapping.common.api.BeanMapper} using orika
 * {@link ma.glasnost.orika.Mapper}.
 *
 * @author oelsabba
 */
public class OrikaBeanMapper extends AbstractBeanMapper {

  /** The dozer instance to use. */
  private Mapper orika;

  /**
   * The constructor.
   */
  public OrikaBeanMapper() {

    super();
  }

  /**
   * @param orika is the {@link ma.glasnost.orika.Mapper} to {@link Inject}.
   */
  @Inject
  public void setOrika(Mapper orika) {

    this.orika = orika;
  }

  /**
   * {@inheritDoc}
   */
  @Override
  public <T> T map(Object source, Class<T> targetClass) {

    // TODO Auto-generated method stub
    return null;
  }

}
